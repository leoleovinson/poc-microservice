package com.leo.microservice.cartservice.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Cart {
	

	private Long cartId;
	
	private double totalPrice;

	private List<CartItem> cartitems = new ArrayList<>();

	private Date dateCreated;
	
	
	

}
