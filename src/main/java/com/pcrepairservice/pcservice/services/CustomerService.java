package com.pcrepairservice.pcservice.services;

import com.pcrepairservice.pcservice.models.dtos.CustomerDTO;

import java.util.List;

public interface CustomerService {
    CustomerDTO createCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> getAllCustomers();

    CustomerDTO updateCustomerById(long id, CustomerDTO userDTO);

    void deleteCustomerById(long customerId);
}
