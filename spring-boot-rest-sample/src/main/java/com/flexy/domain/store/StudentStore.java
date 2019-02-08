package com.flexy.domain.store;

import com.flexy.device.*;
import com.flexy.domain.model.Course;
import com.flexy.domain.model.DeviceInfo;
import com.flexy.domain.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class StudentStore {

    @Value("${soap.device.management}")
    private String deviceManagementEndpoint;

    public List<Student> findAllStudentsWithCourse() {
        List<Student> students = new ArrayList<>();
        Student arun = new Student();
        arun.setStudentId(1);
        arun.setStudentName("Arun");
        arun.setGender("M");
        arun.setCourses(findAllCourses());
        arun.setDeviceInfo(findDevice(1));
        students.add(arun);

        Student ashok = new Student();
        ashok.setStudentId(2);
        ashok.setStudentName("Ashok");
        ashok.setGender("M");
        ashok.setCourses(findAllCourses());
        ashok.setDeviceInfo(findDevice(2));
        students.add(ashok);

        return students;
    }

    public List<Course> findAllCourses() {
        List<Course> courses = new ArrayList<>();

        Course aws = new Course();
        aws.setCourseId(1);
        aws.setCourseName("AWS");
        courses.add(aws);

        Course dataScience = new Course();
        dataScience.setCourseId(2);
        dataScience.setCourseName("Data Science");
        courses.add(dataScience);

        return courses;
    }


    private DeviceInfo findDevice(int deviceId) {
        log.info("Finding device details...");
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(DevicePort.class);
        jaxWsProxyFactoryBean.setAddress(deviceManagementEndpoint);
        jaxWsProxyFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        jaxWsProxyFactoryBean.getInInterceptors().add(new LoggingInInterceptor());

        DevicePort devicePort = (DevicePort) jaxWsProxyFactoryBean.create();

        GetDeviceDetailsRequest getDeviceDetailsRequest = new GetDeviceDetailsRequest();
        getDeviceDetailsRequest.setId(deviceId);
        GetDeviceDetailsResponse getDeviceDetailsResponse = devicePort.getDeviceDetails(getDeviceDetailsRequest);
        DeviceDetails deviceDetails = getDeviceDetailsResponse.getDeviceDetails();

        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setId(deviceDetails.getId());
        deviceInfo.setDeviceName(deviceDetails.getName());
        deviceInfo.setDeviceDetail(deviceDetails.getDescription());

        log.info("Got the the device details.");
        return deviceInfo;

    }

}
