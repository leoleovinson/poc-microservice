package com.leo.microservice.productservice.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;


@Data
public class ProductDto {

	private Long productId;
	
	@NotNull(message = "Enter a product name")
//	@Column(unique = true)
	private String productName;
	
	@NotNull(message = "Enter a product description")
	private String productDescription;
	
	@Min(value = 1, message = "The value must be positive")
	@Digits(fraction = 2, integer = 10, message = "Must only contain 2 decimal places")
	private double price;


}
