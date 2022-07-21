/*WAP in spring core to read the data using post_construct annotated method by user and
perform calculation of average of numbers.*/

package com.springcore.Que2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Average {
	
	int n1,n2,n3,n4;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

	public Average(int n1, int n2, int n3, int n4) {
		super();
		
	}

	public int getN4() {
		return n4;
	}

	public void setN4(int n4) {
		this.n4 = n4;
	}
	
	
	//Constructor
	public Average() {
		super();
	}
	
	public void next()
	{
		System.out.println("Should run after post constructor ..");
	}
	
	@PostConstruct
	public void AvgOfNumber()
	{
		int avg=(n1+n2+n3+n4)/4;
		System.out.println("Post Construct Method is called Firstly...");
		System.out.println("Average is :"+avg);
	}

	@PreDestroy
	public void preDestroy()
	{
		System.out.println("Pre Destroy method called...");
	}
	

}
