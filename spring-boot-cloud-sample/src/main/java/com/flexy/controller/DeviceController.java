package com.flexy.controller;

import com.flexy.model.Device;
import com.flexy.service.DeviceService;
import com.flexy.service.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class DeviceController {

    @Autowired
    private DeviceService deviceService;



    @RequestMapping(path = "/devices", method = RequestMethod.GET)
    public List<Device> getDevices() {
        List<Device> deviceListResponse = new ArrayList<>();
        deviceListResponse.add(deviceService.getDevice());
        return deviceListResponse;
    }

    @RequestMapping(path = "/v2/devices", method = RequestMethod.GET)
    public List<Device> getDevicesV2() {
        List<Device> deviceListResponse = new ArrayList<>();
        deviceListResponse.add(deviceService.getDeviceV2());
        return deviceListResponse;
    }


}
