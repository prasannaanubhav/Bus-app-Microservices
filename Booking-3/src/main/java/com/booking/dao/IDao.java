package com.booking.dao;

import java.util.List;

import com.booking.entity.BookingDetails;
import com.booking.entity.CustomerEntity;
import com.booking.entity.SubBookEntity;

public interface IDao {

	List<BookingDetails> bookDetails(int id);
	
	String booking(int custid,int schid);

	String subbooking(int custid,int schid,CustomerEntity customerEntity,int age,String name,String gender);
	
	List<SubBookEntity> viewSubbookdetails(int bookid);
}
