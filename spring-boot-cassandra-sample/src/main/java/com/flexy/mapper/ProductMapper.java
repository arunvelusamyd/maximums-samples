package com.flexy.mapper;

import com.flexy.domain.ProductEntity;
import com.flexy.model.Product;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
@DecoratedWith(ProductDecorator.class)
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mappings({
            @Mapping(source = "productName", target = "productName"),
            @Mapping(source = "productDescription", target = "productDescription")
    })
    ProductEntity productTOProductEntity(Product product);

    @InheritInverseConfiguration
    Product productEntityToProduct(ProductEntity productEntity);

}
