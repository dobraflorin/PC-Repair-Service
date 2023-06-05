package com.pcrepairservice.pcservice.controllers;

import com.pcrepairservice.pcservice.models.dtos.CustomerDTO;
import com.pcrepairservice.pcservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
@RestController("/api/customers")
public class CustomerController {
    public final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping
    public ResponseEntity<CustomerDTO> customerDTOResponseEntity(@RequestBody @Validated CustomerDTO customerDTO){
        return ResponseEntity.ok(customerService.createCustomer(customerDTO));
    }

}

