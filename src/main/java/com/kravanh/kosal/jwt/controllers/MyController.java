package com.kravanh.kosal.jwt.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/information")
public class MyController {
    @GetMapping("/all")
    public String myInformation() {
        return "Hello I am Kosal I am from";
    }
}
