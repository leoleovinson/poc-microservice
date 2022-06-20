package com.leo.microservices.cartgatewayservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.microservices.cartgatewayservice.dto.CartDto;
import com.leo.microservices.cartgatewayservice.dto.CartItemDto;
import com.leo.microservices.cartgatewayservice.service.CartGatewayService;

@RestController
@RequestMapping("/carts")
public class CartGatewayController {
	
	@Autowired
	CartGatewayService grpcClientService;
	
	@GetMapping("/all")
	public ResponseEntity<List<CartDto>> getCarts(){
		List<CartDto> carts  = grpcClientService.getCarts();
		return new ResponseEntity<>(carts, HttpStatus.FOUND);
	}
	
	@PostMapping("/new")
	public ResponseEntity<CartDto> createCart(){
		CartDto cartDto = grpcClientService.createCart();
		return new ResponseEntity<>(cartDto, HttpStatus.FOUND);
	}
	
	@GetMapping("{cartId}")
	public ResponseEntity<CartDto> getCartById(@PathVariable("cartId") Long cartId){
		CartDto cartDto = grpcClientService.getCartById(cartId);
		return new ResponseEntity<>(cartDto, HttpStatus.FOUND);
	}
	
	@PostMapping("/{cartId}/product/{productId}")
	public ResponseEntity<CartDto> addItemToCart(@PathVariable("cartId") Long cartId, @PathVariable("productId") Long productId, 
				@RequestBody CartItemDto cartItemDto){
		CartDto cartDto = grpcClientService.addToCart(cartId, productId, cartItemDto);
		return new ResponseEntity<>(cartDto, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{cartId}/product/{productId}/remove")
	public ResponseEntity<CartDto> removeFromCart(@PathVariable("cartId") Long cartId, @PathVariable("productId") Long productId){
		CartDto cartDto = grpcClientService.deleteFromCart(cartId, productId);
		return new ResponseEntity<>(cartDto, HttpStatus.OK);
	}
	
	
	
	
	
	
}
