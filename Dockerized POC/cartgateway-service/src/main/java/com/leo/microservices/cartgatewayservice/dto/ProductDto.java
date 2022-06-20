package com.leo.microservices.cartgatewayservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDto {

	private Long productId;
	
	private String productName;
	
	private String productDescription;
	
	private double price;

	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", price=" + price + "]";
	}

	

}