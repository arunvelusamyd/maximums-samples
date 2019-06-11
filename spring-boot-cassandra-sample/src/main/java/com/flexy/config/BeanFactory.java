package com.flexy.config;

import com.flexy.mapper.ProductMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

    @Bean
    public ProductMapper productMapper() {
        return ProductMapper.INSTANCE;
    }

}
