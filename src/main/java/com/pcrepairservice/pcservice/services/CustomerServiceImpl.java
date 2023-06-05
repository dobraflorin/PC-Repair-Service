package com.pcrepairservice.pcservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pcrepairservice.pcservice.models.dtos.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    private final ObjectMapper objectMapper;

    public CustomerServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        return null;
    }
}
