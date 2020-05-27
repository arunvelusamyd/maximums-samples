package com.flexy.service;

import com.flexy.dao.ProductStore;
import com.flexy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductStore productStore;

    @Override
    public Map<String, List<Product>> getProducts() {
        List<Product> productList = productStore.findAll();
        Map<String, List<Product>> productResponse = new HashMap<>();
        productResponse.put("products", productList);
        return productResponse;
    }

    @Override
    public Product getProduct(String productId) {
        Product productResponse = productStore.findById(productId);
        return productResponse;
    }

    @Override
    public Product createProduct(Product product) {
        Product productResponse = productStore.save(product);
        return productResponse;
    }
}
