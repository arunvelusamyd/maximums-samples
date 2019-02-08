package com.flexy.student.devicemanagement.soap;

import java.util.List;

import com.flexy.student.devicemanagement.soap.bean.Device;
import com.flexy.student.devicemanagement.soap.service.DeviceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.flexy.device.DeviceDetails;
import com.flexy.device.DeleteDeviceDetailsRequest;
import com.flexy.device.DeleteDeviceDetailsResponse;
import com.flexy.device.GetAllDeviceDetailsRequest;
import com.flexy.device.GetAllDeviceDetailsResponse;
import com.flexy.device.GetDeviceDetailsRequest;
import com.flexy.device.GetDeviceDetailsResponse;

@Endpoint
public class DeviceDetailsEndpoint {

	@Autowired
	DeviceDetailsService service;

	@PayloadRoot(namespace = "http://flexy.com/device", localPart = "GetDeviceDetailsRequest")
	@ResponsePayload
	public GetDeviceDetailsResponse processDeviceDetailsRequest(@RequestPayload GetDeviceDetailsRequest request) {

		Device device = service.findById(request.getId());

		return mapDeviceDetails(device);
	}

	private GetDeviceDetailsResponse mapDeviceDetails(Device device) {
		GetDeviceDetailsResponse response = new GetDeviceDetailsResponse();
		response.setDeviceDetails(mapDevice(device));
		return response;
	}

	private GetAllDeviceDetailsResponse mapAllDeviceDetails(List<Device> devices) {
		GetAllDeviceDetailsResponse response = new GetAllDeviceDetailsResponse();
		for (Device device : devices) {
			DeviceDetails mapDevice = mapDevice(device);
			response.getDeviceDetails().add(mapDevice);
		}
		return response;
	}

	private DeviceDetails mapDevice(Device device) {
		DeviceDetails deviceDetails = new DeviceDetails();

		deviceDetails.setId(device.getId());

		deviceDetails.setName(device.getName());

		deviceDetails.setDescription(device.getDescription());
		return deviceDetails;
	}

	@PayloadRoot(namespace = "http://flexy.com/device", localPart = "GetAllDeviceDetailsRequest")
	@ResponsePayload
	public GetAllDeviceDetailsResponse processAllDeviceDetailsRequest(
			@RequestPayload GetAllDeviceDetailsRequest request) {

		List<Device> device = service.findAll();

		return mapAllDeviceDetails(device);
	}

	@PayloadRoot(namespace = "http://flexy.com/device", localPart = "DeleteDeviceDetailsRequest")
	@ResponsePayload
	public DeleteDeviceDetailsResponse deleteDeviceDetailsRequest(
			@RequestPayload DeleteDeviceDetailsRequest request) {

		int status = service.deleteById(request.getId());

		DeleteDeviceDetailsResponse response = new DeleteDeviceDetailsResponse();
		response.setStatus(status);
		
		return response;
	}

}
