package com.flexy.controller;

import com.flexy.model.Product;
import com.flexy.service.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public Map<String, List<Product>> getProduct() {
        log.info("getting products");
        Map<String, List<Product>> productResponse = productService.getProducts();
        return productResponse;
    }

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable String productId) {
        log.info("getting the details of product ,{}", productId);
        Product product = productService.getProduct(productId);
        return product;
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public Product createProduct(@RequestBody Product product) {
        Product productResponse = productService.createProduct(product);
        return productResponse;
    }

}
