package com.custadd.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "busdetails")
public class BusDetailEntity implements Serializable {

	private static final long serialVersionUID = 4794571509492236651L;

	@Id
	private int busId;

	@Column(length = 50)
	private String busName;

	@Column(length = 50)
	private String source;

	@Column(length = 50)
	private String dest;

	@JsonManagedReference
	@OneToMany(mappedBy = "busDetail", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<BusScheduleEntity> busScheduleEntity;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public List<BusScheduleEntity> getBusScheduleEntity() {
		return busScheduleEntity;
	}

	public void setBusScheduleEntity(List<BusScheduleEntity> busScheduleEntity) {
		this.busScheduleEntity = busScheduleEntity;
	}

	
	
}
