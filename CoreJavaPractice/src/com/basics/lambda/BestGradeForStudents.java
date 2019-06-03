package com.basics.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestGradeForStudents {

	public static void main(String[] args) {

		
		String[][] students= { {"Ravi" , "65"},
				 {"Kanth" , "33"},
				 {"Krishna" , "65"},
				 {"Kanth" , "95"}
		};
		
		Stream<String[]> stream1 = Arrays.stream(students);
		Map <String, Integer > m =  new HashMap<>();
		stream1.forEach(e -> {
			int nval = Integer.parseInt(e[1]);
			if (m.get(e[0]) != null)
				nval = (m.get(e[0]) + nval)/2;
			m.put(e[0], nval );	
		});
		
		m.forEach((k,v)-> System.out.println(k + " " +v));
		
		
		Object maxEntryKey = Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getKey();
		System.out.println("maxEntryKey = " + maxEntryKey);
		

		Object maxEntry = Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getValue();      
		System.out.println("maxEntry = " + maxEntry);
		
		
		Optional<Entry<String, Integer>> maxEntryC = m.entrySet()
		        .stream()
		        .max((e1, e2) -> e1.getValue().compareTo(e2.getValue())
		        );

		System.out.println("maxEntryC : " + maxEntryC.get());
		    
		
		//students.
		//Kanth 95
//		Krishna 65
//		Ravi 65

		
Map<String, Integer> m = new HashMap<>();
		
		m.put("ravi", 34);
		m.put("kanth", 67);
		m.put("kiran", 55);
		m.put("krishna", 32);
		m.put("kumar", 12);
		
		Integer max = m.values().stream().max(Integer::compare).get();
		System.out.println("max value : " + max);
		
		
		Map.Entry<String, Integer> maxEntry1 = m.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("max Grade Student and Value : " + maxEntry1.getKey() + "     " + maxEntry1.getValue());
		

		String[][] students1 = {{"Ravi", "67"},{"Kanth", "23"},{"Kiran", "34"},{"Krishna", "66"} };
		Map<String, Integer> arrMap  = Arrays.stream(students1).collect(Collectors.toMap(e -> (String)e[0], e -> Integer.parseInt(e[1])));
		Map.Entry<String, Integer> maxEntryMap = arrMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("maxEntryMap Grade Student and Value : " + maxEntryMap.getKey() + "     " + maxEntryMap.getValue());
//		arrMap.forEach((k,v) -> System.out.println(k +"   " + v));
		
		
		String[][] duplicateStudents = {{"Ravi", "67"},{"Kanth", "96"},{"Kiran", "34"},{"Kanth", "66"} };
		Map<String, Integer> duplicateArrMap  = Arrays.stream(duplicateStudents)
												.collect(Collectors.toMap(e -> (String)e[0], e -> Integer.parseInt(e[1]), (s, a) -> (s + a)/2));
		
		Map.Entry<String, Integer> duplicateMaxEntryMap = duplicateArrMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("duplicateMaxEntryMap Grade Student and Value : " + duplicateMaxEntryMap.getKey() + "     " + duplicateMaxEntryMap.getValue());
		
		
		String[][] scores = {{"Ravi", "67"},{"Kanth", "23"},{"Kiran", "34"},{"Kanth", "66"} };
		  int highestAvg = Integer.MIN_VALUE;
	        Function<String[], Integer> function = new Function<String[], Integer>() {
	            @Override
	            public Integer apply(String[] t) {
	                int sum = 0, count = 0;
	                for (int i = 0; i < scores.length; i++) {
	                    if (t[0].equals(scores[i][0])) {
	                        count++;
	                        sum += Integer.parseInt(scores[i][1]);
	                    }
	                }
	                int avg = sum / count;
	                return highestAvg < avg ? avg : highestAvg;
	            }
	        };
	        System.out.println(Arrays.stream(scores).map(function).max((o1, o2) -> o1.compareTo(o2)).get());

	}

}
