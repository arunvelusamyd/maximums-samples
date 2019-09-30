package com.flexy.redisdemo.controller;

import com.flexy.service.KeyGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @Autowired
    private KeyGeneratorUtil keyGeneratorUtil;

    @RequestMapping(path = "/products/{productId}", method = RequestMethod.GET)
    public @ResponseBody String getProduct(@PathVariable String productId) {
        //Product product = productService.getProduct(productId);
        //return product;
        return null;
    }

    /*@RequestMapping(path = "/products", method = RequestMethod.POST)
    public @ResponseBody Product createProduct(@RequestBody Product product) {
        Product productResponse = productService.createProduct(product);
        return productResponse;
    }*/

}
