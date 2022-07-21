package com.springcore.Que15;

public class Category {
	
	String catname;

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}
	
	
	public void details()
	{
		System.out.println("Customer Name is :"+catname);
	}

}
