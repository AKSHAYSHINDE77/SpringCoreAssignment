package com.springcore.Que1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class factoryMethodTest {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que1/applicationContext.xml");
		
		FactoryMethod obja=(FactoryMethod) ac.getBean("admin");
		obja.msg();
		
		FactoryMethod objb=(FactoryMethod) ac.getBean("user");
		objb.msg();
	}

}
