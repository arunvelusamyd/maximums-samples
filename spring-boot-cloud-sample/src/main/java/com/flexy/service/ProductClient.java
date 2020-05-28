package com.flexy.service;

import com.flexy.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "product-client", url = "http://localhost:8080", fallback = ProductService.class)
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{resourceName}/{resourceId}")
    public Product getDevice(@PathVariable("resourceName") String resourceName, @PathVariable("resourceId") String resourceId);

}
