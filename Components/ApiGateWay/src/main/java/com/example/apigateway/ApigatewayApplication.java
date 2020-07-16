package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}
	@Bean
	public RouteLocator myRoutes1(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/Productos")
						.uri("http://172.17.0.1:8001/"))
				.build();

	}
	@Bean
	public RouteLocator myRoutes2(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/Clientes")
						.uri("http://172.17.0.1:8002/"))
				.build();

	}




}
