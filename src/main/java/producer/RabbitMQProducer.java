package producer;


import dto.MessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQProducer.class);
    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    private  final RabbitTemplate rabbitTemplate;
    public RabbitMQProducer(RabbitTemplate rabbitTemplate, String exchangeName, String routingKey) {
        this.rabbitTemplate = rabbitTemplate;
    }
    public void sendMessageI(MessageDTO message){
        LOGGER.info("Enviando mensagem: {}", message);
        rabbitTemplate.convertAndSend(exchangeName,routingKey,message);
    }
}
