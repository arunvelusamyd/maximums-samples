package com.flexy.service;

import com.flexy.model.Movie;
import com.flexy.model.OttPlatform;

import java.util.List;

public interface IOttService {

    public OttPlatform getOttPlatform(String applicationName);

}
