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
        Employee arun = new Employee();
        arun.setEmployeeId(1);
        arun.setEmployeeName("Arun");
        arun.setGender("M");
        arun.setEducationQualification("MSC(Maths)");
        arun.setRole("Maths Assistant Professor");
        employees.add(arun);

        Employee ashok = new Employee();
        ashok.setEmployeeId(2);
        ashok.setEmployeeName("Ashok");
        ashok.setGender("M");
        ashok.setEducationQualification("ME(Computer science). Msc(Maths)");
        ashok.setRole("Technology Head");
        employees.add(ashok);

        log.info("Returning object from store");
        return employees;
    }

}
