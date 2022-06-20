package com.leo.microservice.cartservice.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
public class CartDto {
	
	private Long id;

	private double totalPrice;
	
	private List<CartItemDto> cartitems = new ArrayList<>();



	
}
