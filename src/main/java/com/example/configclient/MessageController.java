package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class MessageController {
    @Value("${message: Default Hello}")
    private String messages;

    @GetMapping("/message")
    public String getMessage(){
        return messages;
    }

}
