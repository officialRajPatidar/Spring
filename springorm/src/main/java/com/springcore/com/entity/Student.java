package com.springcore.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "st_details")
public class Student {

	@Id
	@Column(name = "st_id")
	private int stId;
	@Column(name = "st_name")

	
	
	private String stName;
	
	@Column(name = "st_city")

	private String stCity;

	/**
	 * @return the stId
	 */
	public int getStId() {
		return stId;
	}

	/**
	 * @param stId the stId to set
	 */
	public void setStId(int stId) {
		this.stId = stId;
	}

	/**
	 * @return the stName
	 */
	public String getStName() {
		return stName;
	}

	/**
	 * @param stName the stName to set
	 */
	public void setStName(String stName) {
		this.stName = stName;
	}

	/**
	 * @return the stCity
	 */
	public String getStCity() {
		return stCity;
	}

	/**
	 * @param stCity the stCity to set
	 */
	public void setStCity(String stCity) {
		this.stCity = stCity;
	}

	public Student(int stId, String stName, String stCity) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stCity = stCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stCity=" + stCity + "]";
	}
	
	
	
	 
}
