package com.flexy.redisdemo.controller;

import com.flexy.redisdemo.model.Product;
import com.flexy.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public @ResponseBody Product getProduct(@PathVariable String productId) {
        Product product = productService.getProduct(productId);
        return product;
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public @ResponseBody Product createProduct(@RequestBody Product product) {
        Product productResponse = productService.createProduct(product);
        return productResponse;
    }

}
