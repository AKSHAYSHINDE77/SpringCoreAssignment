package com.springcore.Que10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que10/applicationContextQ10.xml");
		
		Student sobj= (Student)ac.getBean("stdbean");
		
		System.out.println(sobj.getStd());
	}

}
