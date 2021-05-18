package com.wxf.greetingservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "service-hello-world", fallback = SayHelloServiceFallback.class)
public interface SayHelloService {

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam(value = "name") String name);
}
