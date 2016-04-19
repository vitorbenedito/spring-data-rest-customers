package com.blogspot.devmute.customers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.blogspot.devmute.customers.model.Customer;

@RestResource(path = "customers", rel = "customers")
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
