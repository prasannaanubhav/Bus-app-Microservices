package com.client.entity;

import java.io.Serializable;

import java.util.List;

//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.DynamicInsert;
//import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//@Entity
//@DynamicInsert(true)
//@DynamicUpdate(true)
//@Table(name = "customerdetails")
public class CustomerEntity{
	
	private static final long serialVersionUID = -8607509941140588264L;

//	@Id
//	@Column(length = 10)
	private int id;
	
	//@Column(length = 50)
	private String custFirstName;
	
	//@Column(length = 50)
	private String custLastName;
	
	//@Column(length = 50)
	private String email;
	
	//@Column(length = 50)
	private String password;
	
	//@Column(length = 50)
	private long custWal;
	
	//@JsonManagedReference
	//@OneToMany(mappedBy="customerEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<AddressEntity> address;

	//@JsonManagedReference
	//@OneToMany(mappedBy="customerEntity",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<BookingDetails> bookingDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCustWal() {
		return custWal;
	}

	public void setCustWal(long custWal) {
		this.custWal = custWal;
	}

	public List<AddressEntity> getAddress() {
		return address;
	}

	public void setAddress(List<AddressEntity> address) {
		this.address = address;
	}

	public List<BookingDetails> getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(List<BookingDetails> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	

	
	
	
}
