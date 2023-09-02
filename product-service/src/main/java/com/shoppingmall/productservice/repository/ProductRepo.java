package com.shoppingmall.productservice.repository;
import com.shoppingmall.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, String> {
}
