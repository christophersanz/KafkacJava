package com.cjavaperu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProductorService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String kafkaTopic = "topico-cjava";

    public void send(String message) {

        kafkaTemplate.send(kafkaTopic, message);
    }

}
