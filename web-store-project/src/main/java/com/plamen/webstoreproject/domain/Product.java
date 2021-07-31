package com.plamen.webstoreproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String productName;
	private String productImgUrl;
	private Double productPrice;


	public Product() {
	}


	public Product(String productName, String productImgUrl, Double productPrice) {
		super();
		this.productName = productName;
		this.productImgUrl = productImgUrl;
		this.productPrice = productPrice;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductImgUrl() {
		return productImgUrl;
	}


	public void setProductImgUrl(String productImgUrl) {
		this.productImgUrl = productImgUrl;
	}


	public Double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productImgUrl=" + productImgUrl
				+ ", productPrice=" + productPrice + "]";
	}

	

}
