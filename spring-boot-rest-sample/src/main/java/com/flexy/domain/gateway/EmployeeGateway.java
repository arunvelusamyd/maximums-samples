package com.flexy.domain.gateway;

import com.flexy.domain.dto.Employee;
import io.crnk.client.CrnkClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeGateway {

    @Value("${gateway.employee.baseUrl}")
    private String employeeBaseUrl;

    public Employee getEmployee(int employeeId) {
        CrnkClient crnkClient = new CrnkClient(employeeBaseUrl);
        /*ResourceRepositoryV2<Employee, Serializable> employeeRepo = crnkClient.getRepositoryForType(Employee.class);
        QuerySpec querySpec = new QuerySpec(Employee.class);
        Employee employee = employeeRepo.findOne(employeeId, querySpec);*/
        Employee employee = new Employee();
        employee.setEmployeeId(1001);
        employee.setEmployeeName("Arun");
        employee.setEducationQualification("B.E");
        employee.setGender("M");
        employee.setRole("Engineer");
        return employee;
    }

}
