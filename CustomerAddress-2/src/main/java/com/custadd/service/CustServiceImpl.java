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
	public CustomerEntity getCustForLogin(int id) {

		CustomerEntity customerEntity = dao.getCustForLogin(id);

		return customerEntity;
	}

}
