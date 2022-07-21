package com.springcore.Que4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que4Test {

	public static void main(String[] args) {
		List<Employee> slist=new ArrayList<Employee>();
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que4/applicationContextQ4.xml");
		
		Employee e1=(Employee)ac.getBean("q4");
		Employee e2=(Employee)ac.getBean("q4a");
		
		slist.add(e1);
		slist.add(e2);
		
		List<Employee> list = slist.stream().sorted((s1, s2) -> Double.compare(s1.salary, s2.salary)).toList();
		for (Employee w : list) 
		{
			System.out.println(w.toString());
		
		}
	}

}
