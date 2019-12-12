package com.flexy.dao;

import com.flexy.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();

        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("iPhone");
        product1.setProductDescription("Smart phone from Apple Inc");
        products.add(product1);

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Versa 2");
        product2.setProductDescription("It is smart watch, tracks your activity and sleep. Owned by Google.");
        products.add(product2);

        return products;
    }
}
