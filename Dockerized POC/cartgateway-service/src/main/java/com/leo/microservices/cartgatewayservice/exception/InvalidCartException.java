package com.leo.microservices.cartgatewayservice.exception;

public class InvalidCartException extends RuntimeException{
	
	public InvalidCartException(String message) {
		super(message);
	}

}
