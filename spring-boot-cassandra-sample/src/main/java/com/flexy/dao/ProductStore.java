package com.flexy.dao;

import com.flexy.domain.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductStore extends CrudRepository<ProductEntity, UUID> {

}
