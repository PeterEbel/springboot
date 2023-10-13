package com.shop.customer.controller;

import java.util.List;

import com.shop.customer.ResourceNotFoundException;
import com.shop.customer.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.customer.model.Customer;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List < Customer > getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity <Customer> getCustomerById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id :: " + id));
        return ResponseEntity.ok().body(customer);
    }

}