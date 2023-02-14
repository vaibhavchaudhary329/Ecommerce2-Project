package com.codewithvaibhav.ecommerce2.dao;

import com.codewithvaibhav.ecommerce2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
