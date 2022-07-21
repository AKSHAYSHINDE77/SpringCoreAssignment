package com.springcore.Que6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que6Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/Que6/applicationContextQ6.xml");

		Vowel objv=(Vowel) ac.getBean("que6");
		objv.result();
	}

}
