package com.bus.service;

import java.time.LocalDate;
import java.util.List;

import com.bus.entity.BusDetailEntity;
import com.bus.entity.BusScheduleEntity;

public interface IService {

	List<BusScheduleEntity> getBusDetails(String src,String dest,LocalDate date);

}
