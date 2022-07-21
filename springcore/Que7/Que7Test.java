package com.springcore.Que7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que7Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que7/applicationContextQ7.xml");

		Array1 obja= (Array1)ac.getBean("que7a");
		obja.merge();
	}

}
