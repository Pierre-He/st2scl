package com.example.rentalService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/sayHello")
    public String home() {
        return "Welcome to the Rental Service!";
    }
}