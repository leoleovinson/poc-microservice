package com.leo.microservice.cartservice.service;

import org.springframework.stereotype.Service;

import com.leo.microservice.cartservice.entity.CartItem;

@Service
public interface CartItemService {
	
	CartItem createCartItem(Long cartId, Long productId);

}
