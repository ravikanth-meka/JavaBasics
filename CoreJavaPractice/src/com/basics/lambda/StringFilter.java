package com.basics.lambda;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StringFilter {


		  public static void main(String[] args) {
			  
			  //Version version = java.lang.Runtime.version();
			  
		    ArrayList<String> strings = new ArrayList<String>();
		    strings.add("Hello, World!");
		    strings.add("Welcome to CoderPad.");
		    strings.add("This pad is running Java " );

		    
		    strings.stream().filter(e -> !e.contains("Hello"))
		      .collect(Collectors.toList())
		      .forEach(x-> System.out.println(x));
		               
		      
		      
		/*
		 * for (String string : strings) { System.out.println(string); }
		 */
		  }


}
