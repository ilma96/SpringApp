package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @GetMapping("/")
    public String getReversedString(){
        return "Is Spring reversed? Yes." ;
    }
}
