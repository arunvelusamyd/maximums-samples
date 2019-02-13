package com.flexy.domain.gateway;

import com.flexy.domain.dto.Employee;
import io.crnk.client.CrnkClient;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryV2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class EmployeeGateway {

    @Value("${gateway.employee.baseUrl}")
    private String employeeBaseUrl;

    public Employee getEmployee(int employeeId) {
        CrnkClient crnkClient = new CrnkClient(employeeBaseUrl);
        ResourceRepositoryV2<Employee, Serializable> employeeRepo = crnkClient.getRepositoryForType(Employee.class);
        QuerySpec querySpec = new QuerySpec(Employee.class);
        Employee employee = employeeRepo.findOne(employeeId, querySpec);
        return employee;
    }

}
