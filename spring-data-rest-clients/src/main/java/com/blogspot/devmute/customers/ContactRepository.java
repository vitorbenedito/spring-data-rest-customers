package com.blogspot.devmute.customers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

import com.blogspot.devmute.customers.model.Contact;

@RestResource(path = "contacts", rel = "contacts")
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
