package com.scenarios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetListBasedOnAnotherList {

	public static void main(String[] args) {

		List<Employee> emplList = new ArrayList<>();
		List<Department> deptList = new ArrayList<>();
		
		emplList.add(new Employee(123,"Ravi",2));
		emplList.add(new Employee(234,"Kanth",1));
		emplList.add(new Employee(456,"Tulasi",3));
		
		deptList.add(new Department(1, "sales"));
		deptList.add(new Department(2, "marketing"));
		deptList.add(new Department(3, "IT"));
		
		 
	    List<Employee> filteredList = emplList.stream()
	      .filter(empl -> deptList.stream()
	        .anyMatch(dept -> 
				          dept.getDepartment().equals("sales") && 
				          dept.getDepartmentId().equals(empl.getDepartmentId())
	          )).collect(Collectors.toList());
	 

	    filteredList.forEach(e -> System.out.println(e.getEmployeeId() + "  " + e.getEmployeeName()));
	}

}
