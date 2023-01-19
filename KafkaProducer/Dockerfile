FROM openjdk:17-alpine
WORKDIR /app
ADD ./build/libs/KafkaProducer-0.0.1-SNAPSHOT.jar kafka-producer.jar
ENTRYPOINT ["java","-jar","kafka-producer.jar"]