package com.pcrepairservice.pcservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pcrepairservice.pcservice.exceptions.CustomerNotFoundException;
import com.pcrepairservice.pcservice.models.dtos.CustomerDTO;
import com.pcrepairservice.pcservice.models.entities.Customer;
import com.pcrepairservice.pcservice.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    private final ObjectMapper objectMapper;

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(ObjectMapper objectMapper,
                               CustomerRepository customerRepository) {
        this.objectMapper = objectMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = objectMapper.convertValue(customerDTO, Customer.class);
        Customer savedCustomer = customerRepository.save(customer);
        log.info(" Customer " + savedCustomer.getFirstName() + " was created ");
        return objectMapper.convertValue(savedCustomer, CustomerDTO.class);
    }

    @Override
    public CustomerDTO updateCustomerById(long id, CustomerDTO customerDTO) {
        Customer customerFound = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer whit id " + id + " was not found!"));
        customerFound.setFirstName(customerDTO.getFirstName());
        customerFound.setLastName(customerDTO.getLastName());
        customerFound.setEmail(customerDTO.getEmail());
        Customer customerSaved = customerRepository.save(customerFound);
        log.info("Customer whit id " + id + " was updated!");
        return objectMapper.convertValue(customerSaved, CustomerDTO.class);
    }

    @Override
    public void deleteCustomerById(long id) {
        if (customerRepository.existsById(id)) {
            customerRepository.deleteById(id);
            log.info("Customer whit id " + id + " was deleted");
        } else {
            throw new CustomerNotFoundException("Customer not found");
        }

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customersFound = customerRepository.findAll();
        List<CustomerDTO> customersFoundDTO = new ArrayList<>();
        customersFound.forEach(customer -> customersFoundDTO.add(objectMapper.convertValue(customer, CustomerDTO.class)));
        log.info("Customer retrieved: " + customersFound);
        return customersFoundDTO;
    }

}