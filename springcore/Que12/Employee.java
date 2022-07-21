/*WAP in which you will enter employee detail and department names. Now you have to 
found the following.
a. Find maximum salary in a department. 
b. Print name of employees having highest salary
c. Name of employee having salary less than or equal to average salary.
d. Average salary of each department.
*/

package com.springcore.Que12;

public class Employee {

	String empname;
	int salary;
	String department;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}
