package com.flexy.redisdemo.repository;

import com.flexy.redisdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CustomerRepository {

    @Autowired
    private RedisTemplate<String, Customer> redisTemplate;

    public HashOperations getHashOperations() {
        return redisTemplate.opsForHash();
    }

    private HashOperations hashOperations;

    public void save(Customer customer) {
        hashOperations = redisTemplate.opsForHash();
        hashOperations.put("CUSTOMER", customer.getId(), customer);
    }

    public Map<String, Customer> findAll() {
        return hashOperations.entries("CUSTOMER");
    }

    public Customer findById(String id) {
        return (Customer)hashOperations.get("CUSTOMER", id);
    }

    public void update(Customer customer) {
        save(customer);
    }

    public void delete(String id) {

        hashOperations.delete("CUSTOMER", id);
    }

}
