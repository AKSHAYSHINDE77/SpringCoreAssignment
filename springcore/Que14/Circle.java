package com.springcore.Que14;

public class Circle implements Shape{

	@Override
	public void area(int a) {

		double area;
		area=3.14*(a*a);
		System.out.println("Area of Circle is :"+area);
		
		
	}

	@Override
	public void sides() {
		
		System.out.println("Side of Circle is :"+4);
		
	}
	

}
