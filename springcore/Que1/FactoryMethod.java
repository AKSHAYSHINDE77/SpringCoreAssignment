//WAP in spring core to demonstrate role based object creation using factory method.

package com.springcore.Que1;

public class FactoryMethod {

	String person;

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	
	public FactoryMethod() {
		super();
	}
	
	
	public void msg()
	{
		System.out.println("This is :"+person);
	}
	
}
