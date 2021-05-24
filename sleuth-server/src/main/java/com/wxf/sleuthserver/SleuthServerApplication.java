package com.wxf.sleuthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class SleuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthServerApplication.class, args);
    }

}
