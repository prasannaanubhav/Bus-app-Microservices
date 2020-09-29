package com.client.entity;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.List;

//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.DynamicInsert;
//import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

//@Entity
//@DynamicInsert(true)
//@DynamicUpdate(true)
//@Table(name = "bookingdetails")
public class BookingDetails implements Serializable {

	private static final long serialVersionUID = -6076238072007942277L;

//	@Id
//	@GeneratedValue
	private int bookId;

//	@Column(length = 50)
	private String status;

//	@Column(length = 50)
	private LocalDate bookdate;

	
//	@JsonBackReference
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "cust_id", referencedColumnName = "id")
	private CustomerEntity customerEntity;

	
//	@JsonManagedReference
//	@OneToMany(mappedBy = "bookingDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<SubBookEntity> sbe;


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDate getBookdate() {
		return bookdate;
	}


	public void setBookdate(LocalDate bookdate) {
		this.bookdate = bookdate;
	}


	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}


	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}


	public List<SubBookEntity> getSbe() {
		return sbe;
	}


	public void setSbe(List<SubBookEntity> sbe) {
		this.sbe = sbe;
	}

}
