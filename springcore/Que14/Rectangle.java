package com.springcore.Que14;

public class Rectangle implements Shape{
	
	public void area(int x, int y)
	{
		int rec= x * y;
		System.out.println("Area of Rectangle is :"+rec);
	}

	@Override
	public void area(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sides() {

		System.out.println("Sides of Rectangle is :"+4);
		
	}

}
