package com.flexy.dao;

import com.flexy.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductStore  {

    public Product save(Product product) {
        return product;
    }

    public Product findById(String productId) {
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("iPhone");
        product.setProductDescription("Smart phone from Apple Inc");
        return product;
    }
}
