package com.leo.microservices.cartgatewayservice.utilities;


import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.leo.microservices.cartgatewayservice.dto.CartDto;
import com.leo.microservices.cartgatewayservice.dto.CartItemDto;
import com.leo.microservices.cartgatewayservice.protobuf.CartItemResponse;
import com.leo.microservices.cartgatewayservice.protobuf.CartResponse;

@Component
public class CartConverter {
	
	
	public CartItemDto grpcCartItemToCartItemDto(CartItemResponse cartItemResponse) {
		CartItemDto cartItemDto = new CartItemDto();
		cartItemDto.setCartId(cartItemResponse.getCartId());
		cartItemDto.setCartItemId(cartItemResponse.getCartItemId());
		cartItemDto.setCartItemTotalPrice(cartItemResponse.getCartItemTotalPrice());
		cartItemDto.setProductId(cartItemResponse.getProductId());
		cartItemDto.setProductPrice(cartItemResponse.getProductPrice());
		cartItemDto.setQuantity(cartItemResponse.getQuantity());
		return cartItemDto;
	}

	public CartDto grpcCartToCartDto(CartResponse cartResponse) {
		CartDto cartDto = new CartDto();
		cartDto.setCartId(cartResponse.getCartId());
		cartDto.setCartTotalPrice(cartResponse.getCartTotalPrice());
		cartDto.setCartItems(cartResponse.getCartItemsList().stream().map(this::grpcCartItemToCartItemDto).collect(Collectors.toList()));
		return cartDto;
	}

}