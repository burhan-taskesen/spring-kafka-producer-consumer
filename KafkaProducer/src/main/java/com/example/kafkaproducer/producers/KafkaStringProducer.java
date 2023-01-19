package com.example.kafkaproducer.producers;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaStringProducer {
    private final KafkaTemplate<String , Object> kafkaTemplate;

    public void send(String topic, Object message){
        kafkaTemplate.send(topic, message);
    }

}
