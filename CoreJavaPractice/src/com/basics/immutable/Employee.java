package com.basics.immutable;

import java.util.HashMap;
import java.util.Iterator;

public final class Employee {
	private final int id;
	private final String name;
	private final int deptNo;

	private final HashMap<String,String> testMap;
	
	public Employee(int id, String name, int deptNo, HashMap<String,String> hm) {
		super();
		this.id = id;
		this.name = name;
		this.deptNo = deptNo;
		
		HashMap<String,String> tempMap=new HashMap<String,String>();
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()){
			key=it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap=tempMap;
		
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getDeptNo() {
		return deptNo;
	}


	/**
	 * Accessor function for mutable objects
	 */
	public HashMap<String, String> getTestMap() {
		//return testMap;
		return (HashMap<String, String>) testMap.clone();
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptNo=" + deptNo + ", testMap=" + testMap + "]";
	}
	
	
}
