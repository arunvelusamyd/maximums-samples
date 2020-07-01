package com.flexy.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.flexy.model.OttPlatform;
import com.flexy.service.OttServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OttPlatformQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private OttServiceImpl ottService;

    public OttPlatform ottPlatform(String applicationName) {
        return ottService.getOttPlatform(applicationName);
    }

}
