package com.flexy.service;

import com.flexy.model.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {

    public Product getProduct(String productId);

    public Product createProduct(Product product);

    public Map<String, List<Product>> getProducts();

}
