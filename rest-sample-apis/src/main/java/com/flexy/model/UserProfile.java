package com.flexy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserProfile {

    @JsonProperty("id")
    private String userId;

    private String userName;

    private String status;

    private String level;

}
