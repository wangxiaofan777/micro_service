package com.wxf.greetingservice.controller;

import com.wxf.greetingservice.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    /*  @Autowired
      private GreetingService greetingService;*/
    @Autowired
    private SayHelloService sayHelloService;

    @Value("${defaultName}")
    private String defaultName;

    /*@GetMapping(value = "/greeting")
    public String greeting(@RequestParam String name) {
        return greetingService.greeting(name);
    }*/


    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam String name) {
        if(name == null || "".equals(name)) {
            return defaultName;
        }
        return sayHelloService.sayHello(name);
    }

    @GetMapping(value = "/name")
    public String getName(String name) {
        if (defaultName == null || defaultName.equals("")) {
            return name;
        }
        return defaultName;
    }
}