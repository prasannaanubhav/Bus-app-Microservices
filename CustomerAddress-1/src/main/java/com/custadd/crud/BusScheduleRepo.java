package com.custadd.crud;

import org.springframework.data.repository.CrudRepository;

import com.custadd.entity.BusScheduleEntity;

public interface BusScheduleRepo extends CrudRepository<BusScheduleEntity, Integer> {

}
