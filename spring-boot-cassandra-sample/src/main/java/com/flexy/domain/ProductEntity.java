package com.flexy.domain;

import com.datastax.driver.core.DataType;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@Table("products")
public class ProductEntity {

    @PrimaryKey
    @CassandraType(type = DataType.Name.UUID)
    private UUID productId;

    private String productName;

    private String productDescription;

}
