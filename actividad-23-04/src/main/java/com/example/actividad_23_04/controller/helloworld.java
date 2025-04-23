package com.example.actividad_23_04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class helloworld {

    @GetMapping("/hola")

    public String HolaMundo(@RequestParam String nombre){
        return "mi nombre es"+nombre;

    }

}
