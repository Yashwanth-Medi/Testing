package com.infinite.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.Pojo.Product;
import com.infinite.Repositery.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public Product findProductById(Long productid) {
		return productRepository.findById(productid).orElseThrow(IllegalArgumentException::new);

	}

}
