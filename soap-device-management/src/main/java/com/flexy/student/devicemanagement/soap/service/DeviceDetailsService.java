package com.flexy.student.devicemanagement.soap.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.flexy.student.devicemanagement.soap.bean.Device;
import org.springframework.stereotype.Component;

@Component
public class DeviceDetailsService {

	private static List<Device> devices = new ArrayList<>();

	static {
		Device device1 = new Device(1, "iPad", "It is a tablet computers designed, developed and marketed by Apple.");
		devices.add(device1);

		Device device2 = new Device(2, "Samsung Gear VR", "It is a mobile virtual reality headset developed by Samsung Electronics");
		devices.add(device2);

		Device device3 = new Device(3, "Xbox", "Xbox is a video gaming brand created and owned by Microsoft");
		devices.add(device3);

		Device device4 = new Device(4, "Pixel", "It is a android smart phone designed, developed and marketed by Google.");
		devices.add(device4);
	}

	public Device findById(int id) {
		for (Device device : devices) {
			if (device.getId() == id)
				return device;
		}
		return null;
	}

	public List<Device> findAll() {
		return devices;
	}

	public int deleteById(int id) {
		Iterator<Device> iterator = devices.iterator();
		while (iterator.hasNext()) {
			Device device = iterator.next();
			if (device.getId() == id) {
				iterator.remove();
				return 1;
			}
		}
		return 0;
	}

}
