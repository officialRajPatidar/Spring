package com.springcore.auto.wire;

public class Emp {

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
public void setAddress(Address address) {
	this.address = address;
}

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
