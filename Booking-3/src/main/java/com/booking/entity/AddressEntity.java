package com.booking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@DynamicInsert(true)
@DynamicUpdate(true)
@Table(name = "addressdetails")
public class AddressEntity implements Serializable {

	private static final long serialVersionUID = -6175480672520385469L;

	@Id
	@GeneratedValue
	private int addressId;

	@Column(length = 50)
	private String city;

	@Column(length = 50)
	private String country;

	@Column(length = 50)
	private String street;

	@Column(length = 50)
	private long pincode;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cust_id", referencedColumnName = "id")
	private CustomerEntity customerEntity;

	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

}
