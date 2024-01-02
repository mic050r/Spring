package com.example.firstproject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControllerAPI {
    @GetMapping("api/hello")
    public String hello() {
        return "hello world";
    }

}
