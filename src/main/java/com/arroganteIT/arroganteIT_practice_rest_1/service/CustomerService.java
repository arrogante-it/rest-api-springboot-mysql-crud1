package com.arroganteIT.arroganteIT_practice_rest_1.service;

import com.arroganteIT.arroganteIT_practice_rest_1.model.Customer;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 */

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
