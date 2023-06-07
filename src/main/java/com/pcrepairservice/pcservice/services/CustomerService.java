package com.pcrepairservice.pcservice.services;

import com.pcrepairservice.pcservice.models.dtos.CustomerDTO;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO customerDTO);
}
