package com.example.actividad_23_04.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class helloworld {

    @GetMapping("/suma")
    public String suma(int num1, int num2){
        return "/api/suma " + String.valueOf(num1+num2);
    }
    @GetMapping("/resta")
    public String resta(int num1, int num2){
        return "/api/resta " + String.valueOf(num1-num2);
    }
    @GetMapping("/multiplicacion")
    public String multi(int num1, int num2){
        return "/api/multiplicacion " + String.valueOf(num1*num2);
    }
    @GetMapping("/division")
    public String divi(int num1, int num2){
        return "/api/division " + String.valueOf( (double) num1/num2);
    }




}
