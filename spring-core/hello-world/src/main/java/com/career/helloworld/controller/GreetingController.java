package com.career.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @GetMapping("/hello")
    public String greeting(@RequestParam(value="name", defaultValue="User" ) String username ) {
        return "Hello " + username + ", Welcome to Spring Boot!";
    }
}
