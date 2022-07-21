package com.springcore.Que11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que11/applicationContextQ11.xml");
		
		List<Student> slist= new ArrayList<>();
		
		Student s1= (Student) ac.getBean("stdbean1");
		Student s2= (Student) ac.getBean("stdbean2");
		
		slist.add(s1);
		slist.add(s2);
		
		for(Student s:slist)
		{
			System.out.println(s.sname+ " "+s.result.total_marks);
		}
		
		System.out.println("Total Marks are : ");
		List<Student> stlist=slist.stream().sorted((a1, a2) -> Double.compare(a1.result.total_marks, a2.result.total_marks)).toList();
		for(Student s: stlist)
		{
			System.out.println(s.result.total_marks);
		}
	}

}
