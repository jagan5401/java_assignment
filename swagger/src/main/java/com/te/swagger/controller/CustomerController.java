package com.te.swagger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.swagger.model.Customer;

@RestController
public class CustomerController {

	
	@PostMapping ("/add")
	public Customer addCustomer (@RequestBody Customer customer) {
		
		System.out.println("ADDED");
		
		return customer;
		
		
	}
}
