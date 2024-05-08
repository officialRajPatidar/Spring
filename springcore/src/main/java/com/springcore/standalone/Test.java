package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/standconfig.xml");
	Person per = (Person) context.getBean("person");
	
	System.out.println(per.getFriends());
	System.out.println(per.getFriends().getClass().getName());

	System.out.println("-----------------------");
	System.out.println(per.getProps());
	System.out.println(per.getProps().getClass().getName());

	System.out.println("-----------------------");
	System.out.println(per.getSubjectprice());
	System.out.println(per.getSubjectprice().getClass().getName());

	System.out.println("-----------------------");

	}

}
