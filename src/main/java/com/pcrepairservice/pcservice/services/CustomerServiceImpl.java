package com.pcrepairservice.pcservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pcrepairservice.pcservice.models.dtos.CustomerDTO;
import com.pcrepairservice.pcservice.models.entities.Customer;
import com.pcrepairservice.pcservice.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    private final ObjectMapper objectMapper;
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(ObjectMapper objectMapper,
                               CustomerRepository customerRepository) {
        this.objectMapper = objectMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = objectMapper.convertValue(customerDTO, Customer.class);
        Customer savedCustomer = customerRepository.save(customer);
        log.info(" Customer " + savedCustomer.getFistName() + " was created ");
        return objectMapper.convertValue(savedCustomer, CustomerDTO.class);
    }
}
