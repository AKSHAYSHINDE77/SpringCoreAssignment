package com.springcore.Que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AvgTest {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que2/applicationContextQ2.xml");
		
		Average obja=(Average)ac.getBean("avgbean");
		
		obja.AvgOfNumber();
	}

}
