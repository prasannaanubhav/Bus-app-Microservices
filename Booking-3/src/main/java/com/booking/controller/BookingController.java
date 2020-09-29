package com.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.booking.entity.BookingDetails;
import com.booking.entity.CustomerEntity;
import com.booking.entity.SubBookEntity;
import com.booking.service.IService;

@RestController
@RequestMapping("booking/details")
public class BookingController {

	@Autowired
	private IService service;

	@Autowired
	private  RestTemplate restTemplate;

	@GetMapping("/{id}")
	public List<BookingDetails> bookingDetails(@PathVariable("id") int id) {

		List<BookingDetails> lst = service.bookDetails(id);
		return lst;
	}

	@GetMapping(path = "/cusid/{custid}/schid/{schid}")
	public String Booking(@PathVariable("custid") int custid, @PathVariable("schid") int schid) {
		String value = service.booking(custid, schid);

		return value;
	}

	@GetMapping(path = "/subbook/cusid/{cusid}/schid/{schid}/name/{name}/age/{age}/gender/{gender}")
	public String subbooking(@PathVariable("cusid") int custid, @PathVariable("schid") int schid,
			@PathVariable("name") String name, @PathVariable("age") int age, @PathVariable("gender") String gender) {

		CustomerEntity customerEntity = restTemplate.getForObject("http://custadd-ws/customer/login/loginById/" + custid,
				CustomerEntity.class);
		String value = service.subbooking(custid, schid, customerEntity, age, name, gender);
		return value;
	}

	@GetMapping(path = "/viewsubbook/bookid/{bookid}")
	public List<SubBookEntity> viewSubbook(@PathVariable("bookid") int bookid) {

		List<SubBookEntity> lst = service.viewSubbookdetails(bookid);
		return lst;
	}

}
