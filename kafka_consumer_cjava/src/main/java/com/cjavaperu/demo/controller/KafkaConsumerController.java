package com.cjavaperu.demo.controller;

import com.cjavaperu.demo.service.KafkaConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recibir")
public class KafkaConsumerController {

    @Autowired
    KafkaConsumerService service;

    @GetMapping(value = "/mostrar")
    public List<String> recibirMensajes(){
        return service.getMensajes();
    }

}
