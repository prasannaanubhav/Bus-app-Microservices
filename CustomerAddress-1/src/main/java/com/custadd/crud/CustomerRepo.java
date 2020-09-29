package com.custadd.crud;

import org.springframework.data.repository.CrudRepository;

import com.custadd.entity.CustomerEntity;

public interface CustomerRepo extends CrudRepository<CustomerEntity, Integer> {

}
