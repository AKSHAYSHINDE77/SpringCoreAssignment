package com.springcore.Que4;

public class Department {

	 int did;
	 String departmentname;
	
	//Getters and setters
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", departmentname=" + departmentname + "]";
	}

	
}
