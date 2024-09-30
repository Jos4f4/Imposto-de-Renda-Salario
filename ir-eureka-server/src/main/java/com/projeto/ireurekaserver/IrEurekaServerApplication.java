package com.projeto.ireurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrEurekaServerApplication.class, args);
	}

}
