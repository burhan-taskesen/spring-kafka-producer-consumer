package com.example.kafkaconsumer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.GsonMessageConverter;
import org.springframework.messaging.converter.SmartMessageConverter;

@Configuration
public class SmartMessageConfig {

    @Bean("jsonConverter")
    public SmartMessageConverter messageConverter(){
        return new GsonMessageConverter();
    }
}
