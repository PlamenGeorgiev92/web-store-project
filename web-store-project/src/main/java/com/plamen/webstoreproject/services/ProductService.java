package com.plamen.webstoreproject.services;

import java.util.List;

import com.plamen.webstoreproject.domain.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product addNewProduct(Product product);

}
