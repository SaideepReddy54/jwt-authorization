package com.example.jwt.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/secure")
public class SecureController {

    @GetMapping("/hello")
    public String secureHello() {
        return "Hello World - JWT Authenticated";
    }
}
