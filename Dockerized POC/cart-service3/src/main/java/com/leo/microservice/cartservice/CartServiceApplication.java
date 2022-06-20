package com.leo.microservice.cartservice;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leo.microservice.cartservice.entity.Cart;
import com.leo.microservice.cartservice.entity.CartItem;


@MappedTypes({Cart.class, CartItem.class})
@MapperScan("com.leo.microservice.cartservice.mapper")
@SpringBootApplication
public class CartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
	}

}
