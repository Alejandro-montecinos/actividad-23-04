package com.example.actividad_23_04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloworld {

    @GetMapping("/hola")
    public String HolaMundo(){
        return "HOLAAAAAA";

    }

}
