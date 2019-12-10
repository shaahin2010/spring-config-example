package com.gmail.shaahin2010.tutorial.configclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/")
public class TestController {

    @Value("${message:default message}")
    private String message;

    @GetMapping
    public String test() {
        return message;
    }
}
