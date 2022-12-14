package com.example.DeployEnvironments02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class basicController {

    @Autowired
    private Environment environment;

    @GetMapping("")
    public String getMessage(){
        return environment.getProperty("Testing");
    }
}