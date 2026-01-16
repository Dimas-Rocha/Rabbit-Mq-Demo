package controller;

import dto.MessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import producer.RabbitMQProducer;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    private final RabbitMQProducer producer;

    public MessageController(RabbitMQProducer producer) {
        this.producer = producer;
    }
    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody MessageRequest request){
       MessageDTO message = new MessageDTO(
               UUID.randomUUID().toString(),
               request.getMessage(),
               LocalDateTime.now(),
                       "API"
       );
       producer.sendMessageI(messageDTO);
       return ResponseEntity.ok("Mensagem enviada para filial!");
    }

    public static class MessageRequest{
        private String message;

        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }

    }

}
