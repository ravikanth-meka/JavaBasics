package com.basics.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindSameStringsfromTwoLists {

	public static void main(String[] args) {


		List<String> strList = new ArrayList<String>();
		strList.add("RAVI");
		strList.add("Siva");
		strList.add("Krishna");
		strList.add("Sai");
		
		
		List<String> strList2 = new ArrayList<String>();
		strList.add("Rama");
		strList.add("Siva");
		strList.add("Kumar");
		strList.add("Sai");
		
		
		List<String> availableInBoth = strList.stream().filter(e -> !strList2.contains((String)e)).collect(Collectors.toList());
		

		List<String> availableInBoth1 = strList.stream().filter(e -> strList2.contains(e)).collect(Collectors.toList());
		
		
		Predicate<String> notIn2 = s -> ! strList2.stream().anyMatch(mc -> s.equals(mc));
		
		List<String> s3 = strList.stream().filter(notIn2).collect(Collectors.toList());
		
		System.out.println("TEST");
		s3.forEach(e -> System.out.println(e));
		System.out.println("\n\n");
		System.out.println("TEST111");
		availableInBoth.forEach(e -> System.out.println(e));
		System.out.println("\n\n");
		System.out.println("TEST1 222");
		availableInBoth1.forEach(e -> System.out.println(e));
		System.out.println("TEST1 333");
		
		
		

	}

}
