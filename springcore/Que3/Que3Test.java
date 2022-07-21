package com.springcore.Que3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que3Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que3/applicationContextQ3.xml");

		Emi obje=(Emi) ac.getBean("emibean");
		obje.CalculateEmi();
	}

}
