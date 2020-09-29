package com.client.controller;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.client.entity.BookingDetails;
import com.client.entity.BusDetailEntity;
import com.client.entity.BusScheduleEntity;
import com.client.entity.CustomerEntity;
import com.client.entity.SubBookEntity;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@Controller
public class JspController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/bus/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	@RequestMapping(value = "/logpage")
	public ModelAndView loginValidation(@RequestParam("custId") int custid, @RequestParam("psw") String pwd,
			Model model) {

		CustomerEntity customerEntity = restTemplate
				.getForObject("http://localhost:8051/customer/login/" + custid + "/" + pwd, CustomerEntity.class);
		model.addAttribute("customerlist", customerEntity);
		if (customerEntity != null) {
			ModelAndView mav = new ModelAndView("home");
			model.addAttribute("id", custid);
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("login");
			return mav;
		}
	}

	@RequestMapping(value = "/viewbookdetails")
	public ModelAndView viewBookingDetails(@RequestParam("custid") int id, Model model) {

		BookingDetails[] bookingDetails = restTemplate.getForObject("http://booking-ws/booking/details/" + id,
				BookingDetails[].class);
		model.addAttribute("booklist", bookingDetails);
		ModelAndView mav = new ModelAndView("bookingdetails");
		return mav;
	}

	@RequestMapping(value = "/customerdetails")
	public ModelAndView customerDetails(@RequestParam("custid") int custid, Model model) {
		CustomerEntity customerEntity = restTemplate
				.getForObject("http://custadd-ws/customer/login/loginById/" + custid, CustomerEntity.class);
		model.addAttribute("customerlist", customerEntity);
		if (customerEntity != null) {
			ModelAndView mav = new ModelAndView("customer");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("home");
			return mav;
		}
	}

	@RequestMapping(value = "/bookbus")
	public ModelAndView busBook1() {
		ModelAndView mav = new ModelAndView("busbook1");
		return mav;
	}

	@RequestMapping(value = "/busbook2")
	public ModelAndView busbook2(@RequestParam("source") String src, @RequestParam("destination") String dest,
			@RequestParam("dates") String date, Model model) {

		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		BusScheduleEntity[] busScheduleEntity = restTemplate.getForObject(
				"http://busmaster-ws/bus/master/" + src + "/" + dest + "/" + dt, BusScheduleEntity[].class);
		model.addAttribute("busdetails", busScheduleEntity);
		ModelAndView mav = new ModelAndView("buslist");
		return mav;
	}

	@RequestMapping(value = "/bookbutton")
	public ModelAndView bookButton(@RequestParam("custid") String cusid, @RequestParam("schid") String schid) {
		String value = restTemplate
				.getForObject("http://booking-ws/booking/details/cusid/" + cusid + "/schid/" + schid, String.class);
		ModelAndView mav = new ModelAndView("subbookpage");
		return mav;
	}

	@RequestMapping(value = "/subbook2")
	public ModelAndView subbook() {
		ModelAndView mav = new ModelAndView("subbooking");
		return mav;
	}

	@RequestMapping(value = "/addbookingticket")
	public ModelAndView subbooking(@RequestParam("cid") int cusid, @RequestParam("schid") int schid,
			@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("gender") String gender) {

		String value = restTemplate.getForObject("http://booking-ws/booking/details/subbook/cusid/" + cusid
				+ "/schid/" + schid + "/name/" + name + "/age/" + age + "/gender/" + gender, String.class);
		ModelAndView mav = new ModelAndView("subbookpage");
		return mav;
	}

	@RequestMapping(value = "/BookingSuccess")
	public ModelAndView success() {
		ModelAndView mav = new ModelAndView("success");
		return mav;

	}

	@RequestMapping(value = "/subbookdetails")
	public ModelAndView viewSubbook(@RequestParam("bookid") int bookid, Model model) {

		SubBookEntity[] subBookEntity = restTemplate.getForObject(
				"http://booking-ws/booking/details/viewsubbook/bookid/" + bookid, SubBookEntity[].class);

		model.addAttribute("subbook", subBookEntity);
		ModelAndView mav = new ModelAndView("viewsubbook");
		return mav;

	}

	@RequestMapping(value = "/home")
	public ModelAndView home(Model model) {
		ModelAndView mav = new ModelAndView("home");
		model.addAttribute("homemsg", "home");
		return mav;
	}

	@RequestMapping(value = "/logout")
	public ModelAndView logout() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

}
