package com.flexy.resolvers;

import com.flexy.service.OttServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OttPlatformMutationResolver {

    @Autowired
    private OttServiceImpl ottService;

}
