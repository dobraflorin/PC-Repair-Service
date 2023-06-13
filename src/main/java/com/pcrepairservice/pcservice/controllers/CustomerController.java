package com.pcrepairservice.pcservice.controllers;

import com.pcrepairservice.pcservice.models.dtos.CustomerDTO;
import com.pcrepairservice.pcservice.services.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    public final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody @Valid CustomerDTO customerDTO) {
        return ResponseEntity.ok(customerService.createCustomer(customerDTO));
    }

    @GetMapping
    public List<CustomerDTO> getCustomers() {
        return customerService.getAllCustomers();
    }

    @PutMapping("{id}")
    public ResponseEntity<CustomerDTO> updateCustomerById(@PathVariable long id, @RequestBody CustomerDTO customerDTO) {
        return ResponseEntity.ok(customerService.updateCustomerById(id, customerDTO));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable long id) {
        customerService.deleteCustomerById(id);
        return ResponseEntity.noContent().build();
    }
}
