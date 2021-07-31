package com.plamen.webstoreproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.plamen.webstoreproject.domain.Product;
import com.plamen.webstoreproject.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "products", method = RequestMethod.POST)
	@ResponseBody
	public Product addNewProduct(@RequestBody Product product) {
		return productService.addNewProduct(product);
	}
	
	@RequestMapping(value = "products", method = RequestMethod.GET)
	public String getAllProducts(Model model){
		 model.addAttribute("products", productService.getAllProducts());
		 return "products/list";
	}
	
	
}
