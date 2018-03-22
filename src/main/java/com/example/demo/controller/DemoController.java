package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${testMessage}")
    private String testMessage;

    @GetMapping("/")
    public String hello() {
        return "Hello! The testMessage is: " + this.testMessage;
    }

}
