package com.flexy.domain.repository;

import com.flexy.domain.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
            //, classes = {EmployeeRepositoryImpl.class})
@ComponentScan(basePackages = "com.flexy.domain", excludeFilters =
    @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = {
            "com.flexy.domain.model.*",
            "com.flexy.domain.repository.*",
            "com.flexy.domain.service.*",
            "com.flexy.domain.store.*"
    }))
@DirtiesContext
public class EmployeeRepositoryImplTest {

    @Autowired
    private EmployeeRepositoryImpl employeeRepository;

    /*@MockBean
    private EmployeeService employeeService;*/

    /*@Autowired
    WebApplicationContext webApplicationContext;*/

    @Test
    public void findOne() {

    }
}