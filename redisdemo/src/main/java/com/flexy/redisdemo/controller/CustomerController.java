package com.flexy.redisdemo.controller;


import com.flexy.redisdemo.model.Customer;
import com.flexy.redisdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/rest/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/add")
    public Customer add(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return customerRepository.findById(customer.getId());
    }

    @PatchMapping("/update/{id}")
    public Customer update(@RequestBody Customer customer) {
        customerRepository.update(customer);
        return customerRepository.findById(customer.getId());
    }

    @GetMapping("/delete/{id}")
    public Map<String, Customer> delete(@PathVariable("id") final String id) {
        customerRepository.delete(id);
        return all();
    }

    @GetMapping("/all")
    public Map<String, Customer> all() {
        return customerRepository.findAll();
    }
}