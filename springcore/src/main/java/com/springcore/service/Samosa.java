package com.springcore.service;

public class Samosa {

	 private long price;

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
		System.out.println("price set here.");
	}

	public Samosa(long price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "samosa ["+ price +"]";
	}
	public void init() {
		System.out.println("init method create");
	}
	 public void distroy() {
		System.out.println("in distroy...!");
	}
	 
}
