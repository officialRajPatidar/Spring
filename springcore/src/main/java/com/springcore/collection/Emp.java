package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
 private String name;
 private List<String> phone;
 private Set<String> address;
 private Map<String , String> courses;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the phone
 */
public List<String> getPhone() {
	return phone;
}
/**
 * @param phone the phone to set
 */
public void setPhone(List<String> phone) {
	this.phone = phone;
}
/**
 * @return the address
 */
public Set<String> getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(Set<String> address) {
	this.address = address;
}
/**
 * @return the courses
 */
public Map<String, String> getCourses() {
	return courses;
}
/**
 * @param courses the courses to set
 */
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public Emp(String name, List<String> phone, Set<String> address, Map<String, String> courses) {
	super();
	this.name = name;
	this.phone = phone;
	this.address = address;
	this.courses = courses;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
 
}
