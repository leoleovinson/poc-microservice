package com.leo.microservices.cartgatewayservice.exception;

public class InvalidCartItemException extends RuntimeException{
	
	public InvalidCartItemException(String message) {
		super(message);
	}

}
