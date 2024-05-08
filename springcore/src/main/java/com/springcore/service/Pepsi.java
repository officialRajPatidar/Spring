package com.springcore.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean {
 private double price;

/**
 * @return the price
 */
public double getPrice() {
	return price;
}

/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
	System.out.println("set the price here");
}

public Pepsi(double price) {
	super();
	this.price = price;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("in initialization...!");
	
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("in disposablebean ...!...!");

}
 
 
}
