package com.custadd.service;

import com.custadd.entity.CustomerEntity;

public interface CustService {

	CustomerEntity getCustForLogin(int id,String psw);
	CustomerEntity getCustdetailsForLogin(int id);
}
