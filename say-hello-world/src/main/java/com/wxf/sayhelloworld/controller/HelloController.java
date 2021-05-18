package com.wxf.sayhelloworld.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/say/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/sayHello")
    @HystrixCommand(fallbackMethod = "sayHelloFallback")
    public String sayHello(String name) {
        return "hello," + name + " from port:" + port;
    }

    public String sayHelloFallback(String name) {
        return "error, " + name;
    }
}
