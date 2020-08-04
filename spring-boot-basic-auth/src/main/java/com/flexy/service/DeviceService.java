package com.flexy.service;

import com.flexy.dto.Product;
import com.flexy.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeviceService {

    @Autowired
    private ProductService productService;

    public Device getDeviceV2() {
        Product product = productService.getDevice("products", "1");
        Device device = new Device();
        device.setDeviceId(product.getProductId());
        device.setDeviceName(product.getProductName());
        device.setDeviceModel("XS");
        device.setAvailable(true);
        device.setOsVersion("iOS 13.5");
        return device;
    }

    public Device getDevice() {
        /*Product product = new RestTemplate()
                .getForObject("http://localhost:8080/products/1",
                        Product.class);*/
        Device device = new Device();
        /*device.setDeviceId(product.getProductId());
        device.setDeviceName(product.getProductName());*/
        device.setDeviceId("1001");
        device.setDeviceName("iPhone");
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
