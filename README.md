🚀 Spring Boot RabbitMQ Demo
---------------------------------------------------
Um projeto demonstrativo de mensageria assíncrona usando Spring Boot e RabbitMQ. Este projeto mostra como configurar, produzir e consumir mensagens em uma arquitetura baseada em eventos.

✨ Funcionalidades
-----------------------------------------------------------------------
✅ Produção e consumo de mensagens JSON

✅ Configuração automatizada do RabbitMQ com Docker

✅ API REST para envio de mensagens

✅ Serialização/Deserialização automática

✅ Logs detalhados de produção/consumo

✅ Health Check do RabbitMQ

✅ Configuração de filas duráveis

✅ Tratamento de erros básico

🛠 Tecnologias
Java 17+
--------------------------------------------------

Spring Boot 3.1.5

RabbitMQ 3.12 (com Management UI)

Docker & Docker Compose

Maven (ou Gradle)

Lombok (para redução de boilerplate)


📦 Pré-requisitos
-------------------------------------------------
Antes de começar, certifique-se de ter instalado:


Java JDK 17+

Maven 3.6+ ou Gradle 7+

Docker e Docker Compose

Git

📁 Estrutura do Projeto
text
----------------------------------------------------
src/main/java/com/example/rabbitmqdemo/
├── config/
│   └── RabbitMQConfig.java        # Configuração RabbitMQ
├── controller/
│   └── MessageController.java     # Endpoints REST
├── dto/
│   └── MessageDTO.java           # Objeto de transferência
├── consumer/
│   └── RabbitMQConsumer.java     # Consumidor de mensagens
├── producer/
│   └── RabbitMQProducer.java     # Produtor de mensagens
└── RabbitmqDemoApplication.java  # Classe principal
