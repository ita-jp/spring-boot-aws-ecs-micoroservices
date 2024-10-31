package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class IndexController {

    private static final String PROCESS_ID = UUID.randomUUID().toString().substring(0, 3);

    @GetMapping("/")
    public String index() {
        return "I'm %s".formatted(PROCESS_ID);
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
