package com.springcore.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
 private String subject;

/**
 * @return the subject
 */
public String getSubject() {
	return subject;
}

/**
 * @param subject the subject to set
 */
public void setSubject(String subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}
 
@PostConstruct
public void init() {
	System.out.println("init annotation");
}

@PreDestroy
public void distroy() {
	System.out.println("distroy annotation");
}
 
}
