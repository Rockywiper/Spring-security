package com.amazonCustomer.AmazonCustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazonCustomer.AmazonCustomer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
