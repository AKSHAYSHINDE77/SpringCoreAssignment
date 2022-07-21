package com.springcore.Que15;

public class Customer {
	
	int cid;
	String customername;
	
	Item item;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public void allitemdetails()
	{
		System.out.println("Customer id :"+cid);
		System.out.println("Customer Name is :"+customername);
		System.out.println("Item id :"+item.id);
		System.out.println("Item Name :"+item.itemname);
		System.out.println("Item Price :"+item.price);
		System.out.println("Category :"+item.cat.catname);
	}

}
