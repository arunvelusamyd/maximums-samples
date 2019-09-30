package com.flexy.service;

import com.flexy.redisdemo.model.Product;

public interface ProductService {

    public Product getProduct(String productId);

    public Product createProduct(Product product);

}
