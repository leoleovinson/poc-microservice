package com.leo.microservice.cartservice.util;

import java.util.Date;

public class CartUtilities {
	
	public static Date getDateAndTime() {
		return new Date();
	}
	private CartUtilities() {
		throw new IllegalStateException("Utility class");
	}

}
