package com.wxf.eshaop.cache.ha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(String name){
        return "Hello " + name;
    }
}
