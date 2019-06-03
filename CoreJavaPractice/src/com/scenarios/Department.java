package com.scenarios;

public class Department {

	Integer departmentId;
	String department;
	
	public Department(Integer departmentId, String department) {
		super();
		this.departmentId = departmentId;
		this.department = department;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	
}