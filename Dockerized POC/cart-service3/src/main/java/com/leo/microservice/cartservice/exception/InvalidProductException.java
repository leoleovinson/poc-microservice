package com.leo.microservice.cartservice.exception;

public class InvalidProductException extends RuntimeException{
	
	public InvalidProductException(String message) {
		super(message);
	}

}
