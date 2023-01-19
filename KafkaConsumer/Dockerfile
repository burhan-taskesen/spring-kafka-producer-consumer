FROM openjdk:17-alpine
WORKDIR /app
ADD ./target/KafkaConsumer-0.0.1-SNAPSHOT.jar kafka-consumer.jar
ENTRYPOINT ["java","-jar","kafka-consumer.jar"]