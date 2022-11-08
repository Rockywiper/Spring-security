package com.amazonCustomer.AmazonCustomer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonCustomer.AmazonCustomer.model.Customer;
import com.amazonCustomer.AmazonCustomer.repository.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired
	private CustomerRepository repo;
	
	public Customer getdetails(Long id)
	{
		List<Customer> cus = repo.findAll();
		
		return cus.stream().filter(c -> c.getcId().equals(id)).findAny().orElse(null);	
		
	}
}
