package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ep")
public class Exampleexpression {
	 @Value("#{22+44}")
	    private int x;

	    @Value("#{T(java.lang.Math).sqrt(25)}")
	    private double y;

	    @Value("#{T(java.lang.Math).PI}")
	    private double z;

	    @Value("#{new java.lang.String('rajjjjj bahiii')}")
	    private String name;

	    @Value("#{8>3}")
	    private boolean isbiger;
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}
	/**
	 * @param z the z to set
	 */
	public void setZ(double z) {
		this.z = z;
	}
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
	 * @return the isbiger
	 */
	public boolean isIsbiger() {
		return isbiger;
	}
	/**
	 * @param isbiger the isbiger to set
	 */
	public void setIsbiger(boolean isbiger) {
		this.isbiger = isbiger;
	}
	@Override
	public String toString() {
		return "Exampleexpression [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isbiger=" + isbiger + "]";
	}
	
	
	
	
	
}
