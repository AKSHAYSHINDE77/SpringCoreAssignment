/*WAP to inject multiple names to a beans and break the names in to array of string and find
out the string which is having no vowel in it.*/

package com.springcore.Que6;

public class Vowel {

	String str[];

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	public void show() {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
		public void result() {
			
		for(String b:str) {
			String s1=b.replaceAll("[aeiouAEIOU]", "");
			if(b.equals(s1)) {
				System.out.println(b);
			}
			
		}
	}
}
