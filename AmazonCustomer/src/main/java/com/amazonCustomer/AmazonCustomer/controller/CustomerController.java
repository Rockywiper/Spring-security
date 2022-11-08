package com.amazonCustomer.AmazonCustomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amazonCustomer.AmazonCustomer.model.Customer;
import com.amazonCustomer.AmazonCustomer.model.CustomerDetails;
import com.amazonCustomer.AmazonCustomer.model.Orders;
import com.amazonCustomer.AmazonCustomer.model.Payments;
import com.amazonCustomer.AmazonCustomer.repository.CustomerRepository;
import com.amazonCustomer.AmazonCustomer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
	private CustomerRepository repo;
	
	@Autowired
	private CustomerService service;
	
	@Autowired
    private RestTemplate restTemplate;
	
	@PostMapping("/add")
	public Customer addDetail(@RequestBody Customer cus)
	{
		return repo.save(cus);
	}
	
	@GetMapping("/getall")
	public List<Customer> getDetails()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/get/{cId}")
	public CustomerDetails getdetails(@PathVariable ("cId") Long id)
	{
		CustomerDetails cd = new CustomerDetails();
		try
		{
		Customer cus = service.getdetails(id);
		cd.setCustomer(cus);
		
		Payments pay = this.restTemplate.getForObject("http://payment/payment/get/"+cus.getpId(),Payments.class);
		cd.setPayment(pay);

		Orders or = this.restTemplate.getForObject("http://order/order/get/"+cus.getoId(),Orders.class);
		cd.setOrders(or);
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return cd;
	}
	
	@PutMapping("/update")
	public Customer putDetail(@RequestBody Customer cus)
	{
		return repo.save(cus);
	}
	
	@DeleteMapping("/delete/{cId}")
	public void delete(@PathVariable Long cId)
	{
		repo.deleteById(cId);
	}
	
}
