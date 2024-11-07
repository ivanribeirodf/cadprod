package com.ivanribeiro.cadprod.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloControler {

    @GetMapping(value = "/")
    public String getMethodName() {
        return "Olá mundo vsCode!!!";
    }
    
    
}