package com.leo.microservices.cartgatewayservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDto {
	
	private Long cartItemId;
	
	private int quantity;
	
	private Long productId;
	
	private Long cartId;
	
	private double productPrice;
	
	private double cartItemTotalPrice;



	
}
