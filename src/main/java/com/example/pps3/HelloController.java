package com.example.pps3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@GetMapping("/hello")
    public String hello() {
        return "Hello luis";
    }
