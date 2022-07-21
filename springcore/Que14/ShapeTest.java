package com.springcore.Que14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {

	public static void main(String[] args) {

		ApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/Que14/applicationContextQ14.xml");
		
		Circle c= (Circle) ac.getBean("fbean1");
		Square s= (Square) ac.getBean("fbean2");
		Rectangle r= (Rectangle) ac.getBean("fbean3");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice : ");
		int ch=sc.nextInt();
		switch (ch)
		{
		case 1:
			c.area(5);
			c.sides();
			 
			break;
		
		case 2:
			s.area(15);
			s.sides();
			
			break;
			
		case 3:
			r.area(9);
			r.sides();
			
			break;
			
		default:
			System.out.println("Error... Please Enter Valid Number...!!!");
		
		}
		
	}

}
