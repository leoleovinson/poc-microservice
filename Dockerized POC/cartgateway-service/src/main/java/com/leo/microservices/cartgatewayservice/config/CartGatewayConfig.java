package com.leo.microservices.cartgatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartGatewayConfig {
	
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
