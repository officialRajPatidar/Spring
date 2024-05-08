package com.springcore.ci;

public class Person {
 
	private String name;
	private int perid;
	private Certi certi;
	
	public Person(String name, int perid, Certi certi) {
		this.name= name;
		this.perid= perid;
		this.certi=certi;
		
		
	}


	@Override
	public String toString() {
		
		return this.name+" : "+this.perid + " { "+this.certi.name+"}";
	}



}
