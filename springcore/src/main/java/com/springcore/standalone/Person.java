package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;
	private Map<String, Integer> subjectprice;
	private Properties props;
	/**
	 * @return the friends
	 */
	/**
	 * @return the friends
	 */
	public List<String> getFriends() {
		return friends;
	}
	/**
	 * @param friends the friends to set
	 */
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	/**
	 * @return the subjectprice
	 */
	public Map<String, Integer> getSubjectprice() {
		return subjectprice;
	}
	/**
	 * @param subjectprice the subjectprice to set
	 */
	public void setSubjectprice(Map<String, Integer> subjectprice) {
		this.subjectprice = subjectprice;
	}
	/**
	 * @return the props
	 */
	public Properties getProps() {
		return props;
	}
	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", subjectprice=" + subjectprice + ", props=" + props + "]";
	}
	
	
	
}
