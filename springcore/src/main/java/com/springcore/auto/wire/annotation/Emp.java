package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
 

 //@Autowired
private Address address;

/**
 * @return the address
 */
public Address getAddress() {
	return address;
}

/**
 * @param address the address to set
 */


//@Autowired
public void setAddress(Address address) {
	this.address = address;
}

@Autowired
public Emp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
