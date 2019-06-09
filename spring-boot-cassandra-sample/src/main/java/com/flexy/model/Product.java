package com.flexy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class Product {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("product-name")
    private String productName;

    @JsonProperty("product-description")
    private String productDescription;

}
