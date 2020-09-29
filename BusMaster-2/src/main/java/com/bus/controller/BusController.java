package com.bus.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.entity.BusDetailEntity;
import com.bus.entity.BusScheduleEntity;
import com.bus.service.IService;

@RestController
@RequestMapping("bus/master")
public class BusController {

	@Autowired
	private IService service;
	
	@GetMapping(path="/{src}/{dest}/{date}")
	public List<BusScheduleEntity> getBusDetails(@PathVariable("src") String src,@PathVariable("dest") String dest,@PathVariable("date") String dt) {
		LocalDate date=LocalDate.parse(dt, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		List<BusScheduleEntity> lst=service.getBusDetails(src, dest, date);
	
		return lst;
	}

	
	
	
}
