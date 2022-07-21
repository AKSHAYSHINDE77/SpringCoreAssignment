package com.springcore.Que9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Que9Test {

	public static void main(String[] args) {
		
		List<Distance> dlist= new ArrayList<Distance> ();
		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que9/applicationContextQ9.xml");

		Distance d1= (Distance) ac.getBean("dbean1");
		Distance d2= (Distance) ac.getBean("dbean2");
		Distance d3= (Distance) ac.getBean("dbean3");
		
		dlist.add(d1);
		dlist.add(d2);
		dlist.add(d3);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entre City1 Name :");
		String City1=sc.next();
		
		System.out.println("Enter City2 Name :");
		String City2=sc.next();
		
		List<Distance> dislist=dlist.stream().filter(a ->a.getCity1().equalsIgnoreCase(City1)).filter(a -> a.getCity2().equalsIgnoreCase(City2)).toList();
		
		if(!dislist . isEmpty())
		{
			for(Distance city : dislist)
			{
				System.out.println("Distance beetween "+city.getCity1()+ " to "+city.getCity2()+" is " +city.getDistance()+ "km");
			}
		}
		else
		{
			System.out.println("Empty");
		}
	}

}
