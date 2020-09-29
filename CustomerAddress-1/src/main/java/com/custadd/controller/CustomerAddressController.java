package com.custadd.controller;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custadd.entity.AddressEntity;
import com.custadd.entity.CustomerEntity;
import com.custadd.service.CustService;

@RestController
@RequestMapping(value="/customer/login")
public class CustomerAddressController {

	@Autowired
	private CustService service;

	@GetMapping(path="/{id}/{psw}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public CustomerEntity getCustForLogin(@PathVariable("id") int id,@PathVariable("psw") String psw) {
		
	CustomerEntity customerEntity =	service.getCustForLogin(id,psw);
		
		return customerEntity;
	}

	@GetMapping(path="/loginById/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public CustomerEntity Customerdetails(@PathVariable("id") int id) {
		
	CustomerEntity customerEntity =	service.getCustdetailsForLogin(id);
		
		return customerEntity;
	}
	
	
	
}

