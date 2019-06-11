package com.flexy.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {

    public static final String KEYSPACE = "arun_keyspace";

    @Override
    protected String getKeyspaceName() {
        return KEYSPACE;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.flexy.domain"};
    }

    @Override
    protected boolean getMetricsEnabled() { return false; }
}
