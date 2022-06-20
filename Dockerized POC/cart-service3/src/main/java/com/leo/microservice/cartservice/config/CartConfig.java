package com.leo.microservice.cartservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.leo.microservice.cartservice.dto.CartDto;
import com.leo.microservice.cartservice.entity.Cart;
import com.leo.microservice.cartservice.entity.CartItem;

@Component
public class CartConfig {
	
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public Cart getCart() {
//		return new Cart();
//	}
//	
//	@Bean
//	public CartItem getCartItem() {
//		return new CartItem();
//	}
//	
	@Bean
	public CartDto getCartDto() {
		return new CartDto();
	}

}
