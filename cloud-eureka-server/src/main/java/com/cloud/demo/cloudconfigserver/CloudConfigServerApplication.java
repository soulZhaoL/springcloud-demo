package com.cloud.demo.cloudconfigserver;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudConfigServerApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(CloudConfigServerApplication.class).web(true).run(args);
    }
}
