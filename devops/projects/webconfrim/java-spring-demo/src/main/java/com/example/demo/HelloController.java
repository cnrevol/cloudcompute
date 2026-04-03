package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello Docker DevOps";
    }

    @GetMapping("/hi")
    public String hello2() {
        return "Hi Bro, come on. ";
    }
}