package com.bus.dao;

import java.time.LocalDate;
import java.util.List;

import com.bus.entity.BusDetailEntity;
import com.bus.entity.BusScheduleEntity;

public interface IDao {

	List<BusScheduleEntity> getBusDetails(String src,String dest,LocalDate date);
}
