package com.study.productService.repository;

import com.study.productService.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

    public Product findByPN(String productName);
}