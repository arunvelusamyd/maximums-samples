package com.flexy.mapper;

import com.flexy.domain.ProductEntity;
import com.flexy.model.Product;

import java.util.UUID;

public abstract class ProductDecorator implements ProductMapper {

    private final ProductMapper productMapper;

    public ProductDecorator(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public ProductEntity productTOProductEntity(Product product) {
        ProductEntity productEntity = productMapper.productTOProductEntity(product);
        String productId = product.getStrProductId();
        productEntity.setProductId(productId!=null?UUID.fromString(productId):UUID.randomUUID());
        return productEntity;
    }

    @Override
    public Product productEntityToProduct(ProductEntity productEntity) {
        Product product = productMapper.productEntityToProduct(productEntity);
        product.setStrProductId(String.valueOf(productEntity.getProductId()));
        return product;
    }
}
