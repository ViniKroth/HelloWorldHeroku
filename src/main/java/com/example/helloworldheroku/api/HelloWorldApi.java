package com.example.helloworldheroku.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World";
    }
}
