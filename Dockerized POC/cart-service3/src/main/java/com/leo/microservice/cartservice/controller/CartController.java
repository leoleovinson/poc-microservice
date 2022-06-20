package com.leo.microservice.cartservice.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import org.springframework.web.client.RestTemplate;

import com.leo.microservice.cartservice.dto.CartDto;
import com.leo.microservice.cartservice.dto.CartItemDto;
import com.leo.microservice.cartservice.dto.ProductDto;
import com.leo.microservice.cartservice.entity.Cart;
import com.leo.microservice.cartservice.entity.CartItem;
import com.leo.microservice.cartservice.mapper.CartItemMapper;
import com.leo.microservice.cartservice.service.CartItemService;
import com.leo.microservice.cartservice.service.CartService;

@RestController
public class CartController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	CartService cartService;
		
	@GetMapping("/carts")
	public ResponseEntity<List<CartDto>> getCarts(){
		List<CartDto> carts = cartService.getCartsDto();
		return new ResponseEntity<>(carts,HttpStatus.OK);
	}
	
	@PostMapping("/carts/new")
	public ResponseEntity<CartDto> createCart(){
		CartDto cartDto = cartService.createCart();
		return new ResponseEntity<>(cartDto, HttpStatus.OK);
	}
	
	@GetMapping("/cart/{cartId}")
	public ResponseEntity<CartDto> getCart(@PathVariable("cartId") Long cartId){
		CartDto cartDto = cartService.getCartDto(cartId);
		return new ResponseEntity<>(cartDto, HttpStatus.OK);
	}
	
	
	@PostMapping("/cart/{cartId}/product/{productId}")
	public ResponseEntity<CartItemDto> addToCart(@PathVariable("cartId") Long cartId, @PathVariable("productId") Long productId, 
			@RequestBody CartItemDto cartItemDto){
//		CartDto cartDto = cartService.getCart(cartId);
//		ProductDto productDto = restTemplate.getForObject("http://localhost:8091/product/" +productId, ProductDto.class);
//		CartItemDto newCartItemDto = cartService.createCartItem(cartDto, productDto, cartItemDto);
		CartItemDto newCartItemDto = cartService.addCartItemToCart(cartId, productId, cartItemDto);
//		CartItemDto newCartItemDto = new CartItemDto();
//		cart.getCartitems().add(cartService.createCartItem(cartId, productId));
		return new ResponseEntity<>(newCartItemDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/cart/{cartId}/product/{productId}/remove")
	public ResponseEntity<CartDto> removeFromCart(@PathVariable("cartId") Long cartId, @PathVariable("productId") Long productId){
		CartDto cartDto = cartService.deleteFromCart(cartId, productId);
		
		return new ResponseEntity<>(cartDto, HttpStatus.OK);
	}

}
