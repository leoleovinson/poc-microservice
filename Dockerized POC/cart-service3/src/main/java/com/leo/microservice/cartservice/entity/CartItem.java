package com.leo.microservice.cartservice.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartItem {
	
	private Long cartItemId;
	
	private int quantity;
	
	private Long productId;
	
	private Long cartId;
	
	private double productPrice;
	
	private double cartItemTotalPrice;
	
	private Date dateCreated;

	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", quantity=" + quantity + ", productId=" + productId
				+ ", cartId=" + cartId + ", productPrice=" + productPrice + ", cartItemTotalPrice=" + cartItemTotalPrice
				+ "]";
	}
	
	

}
