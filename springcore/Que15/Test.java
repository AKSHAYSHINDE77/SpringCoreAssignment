/*WAP in which three beans need to be created item, category and customer. Category 
injected in item and item injected in customer. Now print all item purchased by customer.*/

package com.springcore.Que15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que15/applicationContextQ15.xml");
		
		Customer c= (Customer) ac.getBean("customerbean");
		c.allitemdetails();

	}

}
