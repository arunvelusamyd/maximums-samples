package com.flexy.model;

import lombok.Data;

@Data
public class Device {

    private String deviceId;

    private String deviceName;

    private String deviceModel;

    private String osVersion;

    private boolean isAvailable;

}
