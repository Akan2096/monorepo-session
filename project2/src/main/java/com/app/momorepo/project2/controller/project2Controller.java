package com.app.momorepo.project2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class project2Controller {
    @GetMapping
    public String showGreeting() {
        return "Welcome to PROJECT 222222 !!!";
    }

}
