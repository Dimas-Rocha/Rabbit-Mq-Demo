package consumer;

import dto.MessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    public void consume(MessageDTOmessage){
        LOGGER.info("Mensagem recebida: {}", message);
        processMessage(message);

    }
    private void processMessage(MessageDTO message){
        Logger.info("Processando mensagem do sender: {}", message.getSender());
    }

}
