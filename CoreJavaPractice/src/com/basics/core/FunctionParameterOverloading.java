package com.basics.core;

public class FunctionParameterOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function(10);
	}

	public static void function(Integer It){

	    System.out.println("method with param type – Integer: "+It);

	}

	public static void function(int it){

	    System.out.println("method with param type – int: "+ it);

	}


	
}
