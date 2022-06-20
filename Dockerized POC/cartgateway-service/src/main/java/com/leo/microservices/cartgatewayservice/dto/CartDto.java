package com.leo.microservices.cartgatewayservice.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
	
	private Long cartId;
	
	private double cartTotalPrice;

	private List<CartItemDto> cartItems = new ArrayList<>();

}
