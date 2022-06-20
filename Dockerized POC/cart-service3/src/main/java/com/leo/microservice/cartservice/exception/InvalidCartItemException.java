package com.leo.microservice.cartservice.exception;

public class InvalidCartItemException extends RuntimeException{

	public InvalidCartItemException(String message) {
		super(message);
	}
}
