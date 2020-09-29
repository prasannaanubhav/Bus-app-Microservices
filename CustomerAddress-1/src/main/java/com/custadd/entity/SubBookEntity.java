package com.custadd.entity;

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
@Table(name = "subbookdetails")
public class SubBookEntity implements Serializable {

	private static final long serialVersionUID = -753770065354939114L;

	@Id
	@GeneratedValue
	private int subBookId;
	
	@Column(length = 50)
	private String coName;
	
	@Column(length = 50)
	private String coLastName;
	
	@Column(length = 50)
	private String coGender;
	
	@Column(length = 50)
	private int coAge;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_Id", referencedColumnName = "bookId")
	private BookingDetails bookingDetails;

	public int getSubBookId() {
		return subBookId;
	}

	public void setSubBookId(int subBookId) {
		this.subBookId = subBookId;
	}

	public String getCoName() {
		return coName;
	}

	public void setCoName(String coName) {
		this.coName = coName;
	}

	public String getCoLastName() {
		return coLastName;
	}

	public void setCoLastName(String coLastName) {
		this.coLastName = coLastName;
	}

	public String getCoGender() {
		return coGender;
	}

	public void setCoGender(String coGender) {
		this.coGender = coGender;
	}

	public int getCoAge() {
		return coAge;
	}

	public void setCoAge(int coAge) {
		this.coAge = coAge;
	}

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	
	
}
