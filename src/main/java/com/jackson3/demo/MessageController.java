package com.jackson3.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public Message getMessage() {
        return new Message("Hello from Spring Boot 4 and Jackson 3!");
    }
}
