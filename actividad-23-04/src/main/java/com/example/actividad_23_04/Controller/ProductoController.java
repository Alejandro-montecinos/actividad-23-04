package com.example.actividad_23_04.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @GetMapping
    public String index(){
        return"bienvenido a productos!!!!!";
    }
    @GetMapping("/frutas")
    public String buscador(int inde){
        try {


            List<String> listas = new ArrayList<>();
            listas.add("manzana");
            listas.add("perap");
            listas.add("pipzazz");
            listas.add("holas");
            listas.add("el papu 1234");


            return listas.get(inde);
        } catch (Exception e) {
            return String.valueOf(ResponseEntity.status(HttpStatus.NOT_FOUND).body("Recurso no encontrado"));
        }

    }

}
