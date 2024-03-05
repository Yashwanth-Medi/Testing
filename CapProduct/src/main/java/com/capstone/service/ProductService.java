package com.capstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.model.Product;
import com.capstone.repository.ProductRepository;




@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		System.out.println("1");
		return productRepository.save(product);
		
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
		
	}
	public Product findProductById(Long productid) {
		return productRepository.findById(productid).orElseThrow(IllegalArgumentException::new);

	}


//	
//	public Product deletebyProductId(Long productid) {
//		 return productRepository.deletebyProductId(productid);
//	}
	
	
}
