package com.arroganteIT.arroganteIT_practice_rest_1.repository;

import com.arroganteIT.arroganteIT_practice_rest_1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Customer class.
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
