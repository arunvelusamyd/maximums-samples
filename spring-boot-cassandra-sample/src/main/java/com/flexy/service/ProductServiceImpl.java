package com.flexy.service;

import com.flexy.dao.ProductStore;
import com.flexy.domain.ProductEntity;
import com.flexy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductStore productStore;

    @Override
    public Product getProduct(String productId) {
        Optional<ProductEntity> product = productStore.findById(UUID.fromString(productId));
        Product productResponse = new Product();
        productResponse.setProductId(String.valueOf(product.get().getProductId()));
        productResponse.setProductName(product.get().getProductName());
        productResponse.setProductDescription(product.get().getProductDescription());
        return productResponse;
    }

    @Override
    public Product createProduct(Product product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(UUID.randomUUID());
        productEntity.setProductName(product.getProductName());
        productEntity.setProductDescription(product.getProductDescription());
        ProductEntity productReponse = productStore.save(productEntity);

        product.setProductId(String.valueOf(productReponse.getProductId()));
        return product;
    }
}
