package com.flexy.service;

import com.flexy.model.Product;

import java.util.Optional;

public interface ProductService {

    public Product getProduct(String productId);

    public Product createProduct(Product product);

}
