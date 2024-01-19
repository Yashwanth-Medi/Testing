package com.infinite.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infinite.Pojo.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
