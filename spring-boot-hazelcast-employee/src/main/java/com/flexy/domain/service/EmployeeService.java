package com.flexy.domain.service;

import com.flexy.domain.model.Employee;
import com.flexy.domain.store.EmployeeStore;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class EmployeeService {

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @Autowired
    private EmployeeStore employeeStore;

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = (List<Employee>) getOrstoreInCache("employeeInfo", "allEmployee", null);
        if(employeeList == null) {
            log.info("employeeList is not available in Cache");
            employeeList = employeeStore.findAllEmployee();
            getOrstoreInCache("employeeInfo", "allEmployee", employeeList);
        }
        return employeeList;
    }

    public Employee getEmployee(int employeeId) {
        return employeeStore.findEmployee(employeeId);
    }


    //TODO: You can create an aspect & move the below.
    private Object getOrstoreInCache(String cacheName, String cacheKey, Object object) {
        Map<Object, Object> iCacheMap = hazelcastInstance.getMap(cacheName);
        Object cachedObject = iCacheMap.get(cacheKey);
        if(cachedObject != null) {
            log.info("Returning object from cache");
            return cachedObject;
        } else {
            if (object != null) {
                iCacheMap.put(cacheKey, object);
            }
            return null;
        }
    }

}
