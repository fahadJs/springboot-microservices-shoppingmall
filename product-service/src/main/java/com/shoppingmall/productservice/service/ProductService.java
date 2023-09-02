package com.shoppingmall.productservice.service;

import com.shoppingmall.productservice.dto.ProductRequest;
import com.shoppingmall.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
