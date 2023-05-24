package com.arroganteIT.arroganteIT_practice_rest_1.service;

import com.arroganteIT.arroganteIT_practice_rest_1.model.Customer;
import com.arroganteIT.arroganteIT_practice_rest_1.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getById(Long id) {
        log.info("IN CustomerServiceImpl getByOd {}", id);
        //return customerRepository.findOne(id).orElseThrow();
        //return customerRepository.findOne(id).orElse(null);
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("In CustomerServiceImpl delete {}", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }
}





















