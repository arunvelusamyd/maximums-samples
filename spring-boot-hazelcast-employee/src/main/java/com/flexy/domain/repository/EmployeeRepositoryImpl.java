package com.flexy.domain.repository;

import com.flexy.domain.model.Employee;
import com.flexy.domain.service.EmployeeService;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.DefaultResourceList;
import io.katharsis.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRepositoryImpl extends ResourceRepositoryBase<Employee, Integer> {

    protected EmployeeRepositoryImpl() {
        super(Employee.class);
    }

    @Autowired
    private EmployeeService employeeService;

    @Override
    public ResourceList<Employee> findAll(QuerySpec querySpec) {
        System.out.println(" Getting all employees service started . . . ");
        ResourceList<Employee> employeeResourceList = new DefaultResourceList<>();
        List<Employee> employees = employeeService.getAllEmployees();
        employeeResourceList.addAll(employees);
        return employeeResourceList;
    }

    @Override
    public Employee findOne(Integer employeeId, QuerySpec querySpec) {
        Employee employee = employeeService.getEmployee(employeeId);
        return employee;
    }

}
