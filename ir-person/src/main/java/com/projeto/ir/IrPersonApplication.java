package com.projeto.ir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class IrPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrPersonApplication.class, args);
	}

}
