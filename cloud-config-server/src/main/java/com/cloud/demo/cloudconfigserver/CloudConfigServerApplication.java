package com.cloud.demo.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudConfigServerApplication.class).web(true).run(args);
	}
}
