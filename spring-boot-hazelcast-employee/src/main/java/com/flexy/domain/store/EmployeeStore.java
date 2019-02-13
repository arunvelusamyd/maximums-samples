package com.flexy.domain.store;

import com.flexy.domain.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class EmployeeStore {

    public List<Employee> findAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(findEmployee(1));
        employees.add(findEmployee(2));
        log.info("Returning object from store");
        return employees;
    }

    public Employee findEmployee(int employeeId) {
        Employee employee = new Employee();
        if(employeeId == 1) {
            employee.setEmployeeId(1);
            employee.setEmployeeName("Arun");
            employee.setGender("M");
            employee.setEducationQualification("MSC(Maths)");
            employee.setRole("Maths Assistant Professor");
        } else if(employeeId == 2) {
            employee.setEmployeeId(2);
            employee.setEmployeeName("Ashok");
            employee.setGender("M");
            employee.setEducationQualification("ME(Computer science). Msc(Maths)");
            employee.setRole("Technology Head");
        }
        return employee;
    }

}
