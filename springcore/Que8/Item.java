/*WAP inject list of item to bean and after this arrange all of the, item name in ascending and 
descending order. Also remove any duplicate name of item if present*/

package com.springcore.Que8;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Item {
	
	List item;

	public List getItem() {
		return item;
	}

	public void setItem(List item) {
		this.item = item;
	}

	public void Show()
	{
		System.out.println("List Of Item :- "+this.item);
	}
	
	public void ascending()
	{
		System.out.println("Ascending Value :-");
		item.stream().forEach(System.out::println);
	}
	
	public void descending()
	{
		System.out.println("Descending Value :-");
		item.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
	
	public void duplicateValue()
	{
		System.out.println("After Removing Duplicate Values :-");
		Set result=(Set) item.stream().collect(Collectors.toSet());
		System.out.println(result);
	}
}
