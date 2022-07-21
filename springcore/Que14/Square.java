package com.springcore.Que14;

public class Square implements Shape{

	@Override
	public void area(int a) {

		int ar1=a * a;
		System.out.println("Area of Square is :"+ar1);
		
	}

	@Override
	public void sides() {

		System.out.println("Sides of Square is :"+4);
		
	}
	
	

}
