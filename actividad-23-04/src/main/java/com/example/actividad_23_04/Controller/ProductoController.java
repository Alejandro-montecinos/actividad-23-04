package com.example.actividad_23_04.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @GetMapping
    public String index(){
        return"bienvenido a productos!!!!!";
    }
}
