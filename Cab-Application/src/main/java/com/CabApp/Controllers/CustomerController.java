package com.CabApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CabApp.DTO.LoginRequest;
import com.CabApp.Entities.Customers;
import com.CabApp.Service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/signup")
	public Customers signupCustomers(@RequestBody Customers customers) {
		return customerService.signUp(customers);
	}
	
	@PostMapping("/login")
	public String loginCustomers(@RequestBody LoginRequest loginRequest) throws Exception {
		return customerService.logIn(loginRequest);
	}

}
