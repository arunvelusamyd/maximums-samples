package com.flexy.service;

import com.flexy.dto.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    public Product getDevice(String resourceName, String resourceId) {
        Product product = new Product();
        product.setProductId(resourceId);
        product.setProductName("iPhone pro");
        return product;
    }
}
