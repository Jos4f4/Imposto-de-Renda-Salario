package com.projeto.ir.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;

@OpenAPIDefinition(info =
@Info(title = "Ir-Person Project",
		version  = "v1",
		description = "Documentation of persons"))
@Configuration
public class OpenApiConfig{
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
			.components(new Components())
			.info(
				new io.swagger.v3.oas.models.info.Info()
				.title("Ir-Person Project")
				.version("v1")
				.description("Documentation of persons")
				.termsOfService("https://pub.erudio.com.br/meus-cursos")
				.license(
					new License()
						.name("Apache 2.0")
						.url("https://pub.erudio.com.br/microservices")
				)
			);
	}

}