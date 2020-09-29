package com.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.dao.IDao;
import com.booking.entity.BookingDetails;
import com.booking.entity.CustomerEntity;
import com.booking.entity.SubBookEntity;

@Service
public class ServiceImpl implements IService {

	@Autowired
	private IDao dao;

	@Override
	public List<BookingDetails> bookDetails(int id) {

		List<BookingDetails> lst = dao.bookDetails(id);
		return lst;
	}

	@Override
	public String booking(int custid,int schid) {

		String value=dao.booking(custid, schid);
		
		return value;
	}


	@Override
	public String subbooking(int custid,int schid,CustomerEntity customerEntity, int age, String name, String gender) {
		String value=dao.subbooking(custid, schid, customerEntity, age, name, gender);
		return value;
	}

	@Override
	public List<SubBookEntity> viewSubbookdetails(int bookid) {

		List<SubBookEntity> lst=dao.viewSubbookdetails(bookid);
		return lst;
	}

}
