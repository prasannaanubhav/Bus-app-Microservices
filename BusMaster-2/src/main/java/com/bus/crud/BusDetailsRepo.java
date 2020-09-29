package com.bus.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bus.entity.BusDetailEntity;

public interface BusDetailsRepo extends CrudRepository<BusDetailEntity, Integer> {

	
}
