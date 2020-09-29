package com.bus.crud;

import org.springframework.data.repository.CrudRepository;

import com.bus.entity.BusScheduleEntity;

public interface BusScheduleRepo extends CrudRepository<BusScheduleEntity, Integer>{

}
