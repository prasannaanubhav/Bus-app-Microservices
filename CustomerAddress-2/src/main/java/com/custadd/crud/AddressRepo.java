package com.custadd.crud;

import org.springframework.data.repository.CrudRepository;

import com.custadd.entity.AddressEntity;

public interface AddressRepo extends CrudRepository<AddressEntity, Integer>{

}
