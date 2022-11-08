package com.amazonCustomer.AmazonCustomer.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@RequestMapping("/")
	public String user()
	{
		return "Hi user";
	}
}
