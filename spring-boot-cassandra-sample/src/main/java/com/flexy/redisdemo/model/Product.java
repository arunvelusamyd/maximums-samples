package com.flexy.redisdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {

    @JsonProperty("id")
    private String strProductId;

    @JsonProperty("product-name")
    private String productName;

    @JsonProperty("product-description")
    private String productDescription;

}
