package com.example.kafkaconsumer.handler;

import com.example.kafkaconsumer.model.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageHandler {

    @KafkaListener(topics = "strings", groupId = "1", contentTypeConverter = "jsonConverter")
    public void stringHandler(String message) {
        log.info(message + " - from handler 1");
    }

    @KafkaListener(topics = "users", groupId = "1", contentTypeConverter = "jsonConverter")
    public void userHandler(User message) {
        log.info(message.toString() + " - from handler 2");
    }

}
