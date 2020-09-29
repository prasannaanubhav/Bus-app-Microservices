package com.custadd.crud;

import org.springframework.data.repository.CrudRepository;

import com.custadd.entity.BusDetailEntity;

public interface BusDetailsRepo extends CrudRepository<BusDetailEntity, Integer> {

}
