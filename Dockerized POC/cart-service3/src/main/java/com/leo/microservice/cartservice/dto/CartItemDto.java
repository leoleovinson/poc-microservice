package com.leo.microservice.cartservice.dto;

import java.util.Set;

import com.leo.microservice.cartservice.entity.Cart;
import com.leo.microservice.cartservice.entity.CartItem;

import lombok.AllArgsConstructor;
import lombok.Data;
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
