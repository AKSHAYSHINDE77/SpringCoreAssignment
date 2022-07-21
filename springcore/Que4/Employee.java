/*WAP to perform demonstrate autowire. Use Two classes, first class Employee, second 
department now store all employee and department details. Print employee details in order 
by employee salary .*/

package com.springcore.Que4;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	 int eid;
	 String ename;
	 double salary;
	 
	 @Autowired
	Department department;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department + "]";
	}
	
	

	}
