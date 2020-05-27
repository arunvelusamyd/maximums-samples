package com.flexy.service;

import com.flexy.dto.Product;
import com.flexy.model.Device;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeviceService {

    @HystrixCommand(fallbackMethod = "defaultDevice")
    public Device getDevice() {
        Product product = new RestTemplate()
                .getForObject("http://localhost:8080/products/1",
                        Product.class);
        Device device = new Device();
        device.setDeviceId(product.getProductId());
        device.setDeviceName(product.getProductName());
        device.setDeviceModel("XS");
        device.setAvailable(true);
        device.setOsVersion("iOS 13");
        return device;
    }

    private Device defaultDevice() {
        Device device = new Device();
        device.setDeviceId("1");
        device.setDeviceName("iPhone");
        device.setDeviceModel("XS");
        device.setAvailable(false);
        device.setOsVersion("iOS 13");
        return device;
    }

}
