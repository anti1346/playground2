package com.example.playground2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello, World! #28";
    }
}
