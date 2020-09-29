package com.bus.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.crud.BusDetailsRepo;
import com.bus.crud.BusScheduleRepo;
import com.bus.dao.IDao;
import com.bus.entity.BusDetailEntity;
import com.bus.entity.BusScheduleEntity;

@Service
public class ServiceImpl implements IService{

	@Autowired
	private IDao dao;
	
	@Autowired
	private BusDetailsRepo bdr;
	
	@Autowired
	private BusScheduleRepo bsr;
	
	
	@Override
	public List<BusScheduleEntity> getBusDetails(String src, String dest, LocalDate date) {
		List<BusScheduleEntity>lst=dao.getBusDetails(src, dest, date);
		return lst;
	}

}
