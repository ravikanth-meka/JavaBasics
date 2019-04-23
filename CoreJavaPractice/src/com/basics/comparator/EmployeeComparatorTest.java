package com.basics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorTest {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add( new Employee(1, "Ravi", 10));
		empList.add( new Employee(2, "Ramu", 10));
		empList.add( new Employee(3, "Abhi", 20));
		empList.add( new Employee(4, "Ravi", 20));
		empList.add( new Employee(5, "Siva", 10));
		empList.add( new Employee(6, "Krishna", 20));
		empList.add( new Employee(7, "Bheem", 10));
		
		//empList.sort(new EmployeeComparatorByIdAndName());
		
		//Collections.sort(empList,new EmployeeComparatorByIdAndName());
		
		//empList.forEach((emp)->System.out.println(emp));
		
		
		
		Comparator<Employee> deptNoAndNameComparator = (o1, o2)->{
			int flag = o1.getDeptNo() - o2.getDeptNo();
	        if(flag==0) flag = o1.getName().compareTo(o2.getName());
	        return flag;
		};
		empList.sort(deptNoAndNameComparator);
		empList.forEach((emp)->System.out.println(emp));
		
		
		
	}

}

