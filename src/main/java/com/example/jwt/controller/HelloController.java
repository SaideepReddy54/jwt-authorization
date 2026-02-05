package com.example.jwt.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World - Public API";
    }
}

