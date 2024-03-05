package com.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.model.Product;

import com.capstone.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/save")
	public String addProduct(@RequestBody Product product) {
		System.out.println("1-c");
		service.addProduct(product);
		return "success";
	}

	@GetMapping("{id}")
	public Product findProductById(@PathVariable("id") Long productid) {
		return service.findProductById(productid);
	}
	
	

}
