package com.amazonCustomer.AmazonCustomer;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.amazonCustomer.AmazonCustomer.model.Customer;
import com.amazonCustomer.AmazonCustomer.repository.CustomerRepository;
import com.amazonCustomer.AmazonCustomer.service.CustomerService;

@SpringBootTest
public class AmazonCustomerApplicationTests {

	@Autowired
	private CustomerService service;
	
	@MockBean
	private CustomerRepository repo;
	
	@BeforeEach
	void setup()
	{
		Mockito.when(repo.findById(1L)).thenReturn(null);
	}
	@Test
	public void getcustomerbyaddress()
	{
		String customer="Prasanth";
		Customer cname = service.getdetails(1L);
		assertEquals(customer, cname.getCname());
	}

}
