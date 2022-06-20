package com.leo.microservice.productservice.exception;

public class ProductDuplicateNameException extends RuntimeException {
	
	public ProductDuplicateNameException(String message) {
		super(message);
	}
}
