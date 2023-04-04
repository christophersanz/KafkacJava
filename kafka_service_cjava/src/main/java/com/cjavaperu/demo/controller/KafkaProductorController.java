package com.cjavaperu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjavaperu.demo.service.KafkaProductorService;

@RestController
@RequestMapping("enviar")
public class KafkaProductorController {

	    @Autowired
	    private KafkaProductorService service;

	    @GetMapping("/{mensaje}")
	    public String enviarMensaje(@PathVariable String mensaje) {
	        String respuesta = "Proceso exitoso";
	        try {
				service.send(mensaje);
	        } catch (Exception e) {
	            respuesta = "Error desconocido";
	        }
	        return respuesta;
	    }

	}
