/*WAP to merge two Array from two different class. Two array will get values from the xml file 
and now find maximum out of the merge array.*/

package com.springcore.Que7;

public class Array1 {

	int a[]=new int[5];
	
	Array2 obj2;
	public Array1(int a[], Array2 obj2)
	{
		super();
		this.a=a;
		this.obj2=obj2;
	}
	
	public void merge()
	{
		int c[]= new int[a.length + obj2.b.length];
		int index=0;
		for(int i=0; i<c.length;i++)
		{
			if(i<a.length)
				c[index++]=a[i];
			if(i<obj2.b.length)
				c[index++]=obj2.b[i];
		}
		
		int max= Integer.MIN_VALUE;
		for(int i=0;i<c.length;i++)
		{
			if(max<c[i])
				max=c[i];
		}
		
		System.out.println("Maximum Number Out of Two Array is :"+max);
				
	}
}
