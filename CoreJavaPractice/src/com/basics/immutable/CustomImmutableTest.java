package com.basics.immutable;

import java.util.HashMap;

public class CustomImmutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		Employee e1 = new Employee(1,"Ravi",20,h1);
		System.out.println(e1);
		
		/*HashMap<String, String> hmTest = e1.getTestMap();
		hmTest.put("4", "new");*/
		
		
		e1.getTestMap().put("3", "third");
		System.out.println(e1);
	}

}
