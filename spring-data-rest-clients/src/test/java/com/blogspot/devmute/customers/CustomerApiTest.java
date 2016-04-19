package com.blogspot.devmute.customers;

import static org.junit.Assert.assertNotNull;

import java.net.URI;
import java.util.List;

import org.junit.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.blogspot.devmute.customers.model.Contact;
import com.blogspot.devmute.customers.model.Customer;

public class CustomerApiTest {

    private final RestTemplate restTemplate = new RestTemplate();

    private final String customersUrl = "http://localhost:8080/customers";
    private final String contactUrl = "http://localhost:8080/contacts";

    @Test
    public void testCreateContactWithCustomer() throws Exception {
        restTemplate.postForLocation(customersUrl, sampleCustomerWithContacts());
       
        final URI customerUri = new URI(customersUrl);
        Resource<List<Resource<Customer>>> customers = getCustomers(customerUri);
        assertNotNull(customers);
        
        final URI contactUri = new URI(contactUrl);
        Resource<List<Resource<Contact>>> contacts = getContacts(contactUri);
        assertNotNull(contacts);
        
    }

    private String sampleCustomerWithContacts() {
        return "{\"name\":\"Vitor Nunes\", \"contacts\":[{\"number\":\"997861092\",\"areaCode\":\"12\"}]}";
    }

    private Resource<List<Resource<Contact>>> getContacts(URI uri) {
        return restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<Resource<List<Resource<Contact>>>>() {
        }).getBody();
    }

    private Resource<List<Resource<Customer>>> getCustomers(URI uri) {
        return restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<Resource<List<Resource<Customer>>>>() {
        }).getBody();
    }
}
