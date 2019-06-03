package com.basics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListVariousScenarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		al.add("f");
		
		al.stream().forEach(e -> System.out.println(e));
		
		IntStream.rangeClosed(0, al.size()-1).forEach(i -> System.out.println(al.get(i)));
		System.out.println("Arraylist size before deletion " + al.size());
				
		al.remove(3);
		al.stream().forEach(e -> System.out.println(e));
		System.out.println("Arraylist size after deletion " + al.size());
		IntStream.rangeClosed(0, al.size()-1).forEach(i -> System.out.println(al.get(i)));

		
		
		String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};

		List<String> nameList = Arrays.asList(names);
		
		System.out.println(nameList.size());
		
		
	}

}

