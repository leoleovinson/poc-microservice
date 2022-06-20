package com.leo.microservice.cartservice.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

	private Long productId;
	

	private String productName;
	private String productDescription;
	private double price;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCreated;



	

}
