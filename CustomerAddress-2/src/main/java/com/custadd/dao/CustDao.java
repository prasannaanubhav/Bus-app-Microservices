package com.custadd.dao;

import com.custadd.entity.CustomerEntity;

public interface CustDao {

	CustomerEntity getCustForLogin(int id);
	
}
