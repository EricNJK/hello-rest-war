package com.tutorialspoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String root() {
        return "Hello, Tomcat viewers!";
    }
}