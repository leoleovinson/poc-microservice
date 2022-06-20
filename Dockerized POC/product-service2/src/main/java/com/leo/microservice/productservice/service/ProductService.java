package com.leo.microservice.productservice.service;

import java.util.List;

import com.leo.microservice.productservice.dto.ProductDto;
import com.leo.microservice.productservice.dto.ProductsDto;
import com.leo.microservice.productservice.entity.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	
	ProductDto addProduct(ProductDto productdto);
	
	ProductsDto getAllProductsDto();
	
	Product findProductById(Long productId);
	
	ProductDto updateProduct(Long id, ProductDto productdto);
	

	ProductDto getProduct(Long id);

}
