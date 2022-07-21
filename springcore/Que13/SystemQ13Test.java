package com.springcore.Que13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SystemQ13Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que13/applicationContextQ13.xml");
		
		SystemQ13 s= (SystemQ13) ac.getBean("sbean");
		s.show();

	}

}
