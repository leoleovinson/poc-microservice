package com.leo.microservice.productservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue
	private Long productId;
	
	@Column(unique = true)
	private String productName;
	private String productDescription;
	private double price;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCreated;


//	public Date getDateCreated() {
//		return dateCreated;
//	}
//
//	public void setDateCreated(Date dateCreated) {
//		this.dateCreated = dateCreated;
//	}
//
//	public Long getProductId() {
//		return productId;
//	}
//
//	public void setProductId(Long productId) {
//		this.productId = productId;
//	}
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public String getProductDescription() {
//		return productDescription;
//	}
//
//	public void setProductDescription(String productDescription) {
//		this.productDescription = productDescription;
//	}

}
