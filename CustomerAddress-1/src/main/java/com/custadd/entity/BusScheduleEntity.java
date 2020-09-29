package com.custadd.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@DynamicInsert(true)
@DynamicUpdate(true)
@Table(name = "busscheduledetails")
public class BusScheduleEntity implements Serializable {

	
	private static final long serialVersionUID = -6371964422969109928L;

	@Id
	private int busSchId;
	
	@Column(length = 50)
	private int availSeats;
	
	@Column(length = 50)
	private LocalTime boardTime;
	
	@Column(length = 50)
	private LocalTime deptTime;
	
	@Column(length = 50)
	private long fare;
	
	@Column(length = 50)
	private LocalDate deptDate;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bus_Id", referencedColumnName ="busId")
	private BusDetailEntity busDetail;


	public int getBusSchId() {
		return busSchId;
	}


	public void setBusSchId(int busSchId) {
		this.busSchId = busSchId;
	}


	public int getAvailSeats() {
		return availSeats;
	}


	public void setAvailSeats(int availSeats) {
		this.availSeats = availSeats;
	}


	public LocalTime getBoardTime() {
		return boardTime;
	}


	public void setBoardTime(LocalTime boardTime) {
		this.boardTime = boardTime;
	}


	public LocalTime getDeptTime() {
		return deptTime;
	}


	public void setDeptTime(LocalTime deptTime) {
		this.deptTime = deptTime;
	}


	public long getFare() {
		return fare;
	}


	public void setFare(long fare) {
		this.fare = fare;
	}


	public LocalDate getDeptDate() {
		return deptDate;
	}


	public void setDeptDate(LocalDate deptDate) {
		this.deptDate = deptDate;
	}


	public BusDetailEntity getBusDetail() {
		return busDetail;
	}


	public void setBusDetail(BusDetailEntity busDetail) {
		this.busDetail = busDetail;
	}
	

}
