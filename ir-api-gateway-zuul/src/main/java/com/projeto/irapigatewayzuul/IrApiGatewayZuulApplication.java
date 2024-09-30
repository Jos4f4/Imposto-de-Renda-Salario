package com.projeto.irapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class IrApiGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrApiGatewayZuulApplication.class, args);
	}

}
