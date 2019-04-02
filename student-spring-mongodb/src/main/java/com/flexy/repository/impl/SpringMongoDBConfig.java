package com.flexy.repository.impl;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by arunv on 2/9/15.
 */
@Configuration
public class SpringMongoDBConfig extends AbstractMongoConfiguration {
    @Override
    public String getDatabaseName() {
        return "Mine";
    }

    @Override
    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient("127.0.0.1",27017);
    }
}
