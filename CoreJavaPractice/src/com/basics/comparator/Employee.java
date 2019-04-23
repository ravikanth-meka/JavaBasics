package com.basics.comparator;

public class Employee {
	private int id;
	private String name;
	private int deptNo;

	public Employee(int id, String name, int deptNo) {
		super();
		this.id = id;
		this.name = name;
		this.deptNo = deptNo;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptNo=" + deptNo + "]";
	}
	
	
}
