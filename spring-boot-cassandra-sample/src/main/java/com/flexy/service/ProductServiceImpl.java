package com.flexy.service;

import com.flexy.dao.ProductStore;
import com.flexy.domain.ProductEntity;
import com.flexy.mapper.ProductMapper;
import com.flexy.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductStore productStore;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProduct(String productId) {
        Optional<ProductEntity> product = productStore.findById(UUID.fromString(productId));
        Product productResponse = productMapper.productEntityToProduct(product.get());
        return productResponse;
    }

    @Override
    public Product createProduct(Product product) {
        ProductEntity productEntity = productMapper.productTOProductEntity(product);
        ProductEntity productEntityReponse = productStore.save(productEntity);
        Product productResponse = productMapper.productEntityToProduct(productEntityReponse);
        return productResponse;
    }
}
