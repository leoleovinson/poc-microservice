package com.leo.microservice.cartservice.service;

import java.util.List;

import com.leo.microservice.cartservice.dto.CartDto;
import com.leo.microservice.cartservice.dto.CartItemDto;
import com.leo.microservice.cartservice.entity.Cart;

public interface CartService {
	
	CartDto createCart();
	
	List<CartDto> getCartsDto();
	
	CartDto getCartDto(Long id);
	
	List<Cart> getCarts();
	
	CartItemDto addCartItemToCart(Long cartId, Long productId, CartItemDto cartItemDto);

	CartDto deleteFromCart(Long cartId, Long productId);

	

}
