package com.springcore.Que5;

public class FinalClass implements Number{

	public void show(int a[])
	{
		int maxnum=a[0];
		
		for(int i :a)
		{
			if (i > maxnum)
				maxnum = i;
		}
		
		System.out.println("Maximum Number is :"+maxnum);
	}

}
