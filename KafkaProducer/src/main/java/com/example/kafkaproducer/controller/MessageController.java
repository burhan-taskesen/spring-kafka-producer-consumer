package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.model.User;
import com.example.kafkaproducer.producers.KafkaStringProducer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaStringProducer kafkaStringProducer;

    @PostMapping("/string")
    public void sendMessage(@RequestBody String message){
        kafkaStringProducer.send("strings", message);
    }

    @PostMapping("/user")
    public void sendMessageWithTopic(@RequestBody User user){
        kafkaStringProducer.send("users",user);
    }
}
