package com.custadd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.custadd.dao.CustDao;
import com.custadd.entity.CustomerEntity;

@Service
public class CustServiceImpl implements CustService {

	@Autowired
	private CustDao dao;

	@Override
	public CustomerEntity getCustForLogin(int id,String psw) {

		CustomerEntity customerEntity = dao.getCustForLogin(id,psw);

		return customerEntity;
	}

	@Override
	public CustomerEntity getCustdetailsForLogin(int id) {

		CustomerEntity customerEntity = dao.getCustdetailsForLogin(id);
		return customerEntity;
	}

}
