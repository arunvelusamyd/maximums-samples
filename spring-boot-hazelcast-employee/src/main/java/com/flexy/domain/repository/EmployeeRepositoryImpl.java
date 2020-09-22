package com.flexy.domain.repository;

import com.flexy.domain.model.Employee;
import com.flexy.domain.service.EmployeeService;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.DefaultResourceList;
import io.crnk.core.resource.list.ResourceList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class EmployeeRepositoryImpl extends ResourceRepositoryBase<Employee, Integer> {

    protected EmployeeRepositoryImpl() {
        super(Employee.class);
    }

    @Autowired
    private EmployeeService employeeService;

    @Override
    public ResourceList<Employee> findAll(QuerySpec querySpec) {
        log.info(" Getting all employees service started . . . ");
        ResourceList<Employee> employeeResourceList = new DefaultResourceList<>();
        List<Employee> employees = employeeService.getAllEmployees();
        employeeResourceList.addAll(employees);
        return employeeResourceList;
    }

    @Override
    public Employee findOne(Integer employeeId, QuerySpec querySpec) {
        log.info(" Getting employee by Id {}", employeeId);
        Employee employee = employeeService.getEmployee(employeeId);
        return employee;
    }

}
