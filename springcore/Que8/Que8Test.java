package com.springcore.Que8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que8Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que8/applicationContextQ8.xml");
		
		Item obji= (Item) ac.getBean("itembean");
		
		obji.Show();
		System.out.println("*****************************");
		obji.ascending();
		System.out.println("*****************************");
		obji.descending();
		System.out.println("*****************************");
		obji.duplicateValue();

	}

}
