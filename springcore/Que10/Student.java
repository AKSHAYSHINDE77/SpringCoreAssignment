/*WAP to inject student name and marks into spring bean and you have to use hashmap. Use 
key as student name and marks as value. And sort all the data and print the records. For 
example you can inject map in following way.
<map> 
<entry key-ref="sunil" value-ref="350"></entry> 
<entry key-ref="anil" value-ref="401"></entry> 
</map>*/

package com.springcore.Que10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {

	private HashMap<String, Integer> std;

	public Student() {
		super();
			
	}

	public Map<String, Integer> getStd() {
		
		Map<String, Integer> map= std.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue , (e1 , e2) -> e1, LinkedHashMap :: new));
		
		return std;
	}

	public void setStd(HashMap<String, Integer> std) {
		this.std = std;
	}
	
}
