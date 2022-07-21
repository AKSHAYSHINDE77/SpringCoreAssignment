/*WAP in spring core where we will inject dependent object of result class in student class. In 
student class following fields will be present studentname, rollno, date of birth, classname, 
section. Result class will have following fields, rollno, maths,hindi,English, science, as subject 
name. Create five bean of each and inject the bean as per roll no. Now you need to load the 
bean from container. Load all the objects in List and filter the data on the basis of total 
marks obtain by each student.
*/

package com.springcore.Que11;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	int rollno;
	String sname;
	String dob;
	String clsname;
	String section;
	
	@Autowired
	Result result;

	public Student(int rollno, String sname, String dob, String clsname, String section, Result result) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.dob = dob;
		this.clsname = clsname;
		this.section = section;
		this.result = result;
	}
	
	
}
