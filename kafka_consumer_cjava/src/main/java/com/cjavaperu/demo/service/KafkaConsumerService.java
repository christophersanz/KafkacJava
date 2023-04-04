package com.cjavaperu.demo.service;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EnableKafka
@Component
public class KafkaConsumerService {

    List<String> mensajes = new ArrayList<>();

    @KafkaListener(topics = "topico-cjava", groupId = "myGroup")
    public void processMessage(String content) {
        System.out.println("Message received by consumer 1: " + content);
        mensajes.add(content);
    }

    public List<String> getMensajes(){
        return mensajes;
    }

}
