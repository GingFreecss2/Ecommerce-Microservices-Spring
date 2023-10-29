package com.ecommercemicroservice.productservice.repository;

import com.ecommercemicroservice.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
