package com.leo.microservice.cartservice.exception;

public class InvalidCartException extends RuntimeException{
	
	public InvalidCartException(String message) {
		super(message);
	}

}
