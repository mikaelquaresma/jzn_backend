package com.jzn.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JznBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(JznBackendApplication.class, args);
    }
}

@RestController
class HealthController {

    @GetMapping("/")
    public String home() {
        return "JZN Backend API - Running!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
