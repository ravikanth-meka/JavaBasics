package com.basics.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestHash {

	public static void main(String[] args) {
		//Map map = new LinkedHashMap();
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,"name1");
		map.put(2, "name2");
		map.put(3,"name3");
		
		map.put(8, "name8");
		map.put(9,"name9");
		map.put(10, "name10");
		
		map.put(4, "name4");
		map.put(5,"name5");
		map.put(6, "name6");
		map.put(7,"name7");
		
		map.forEach((k,v) -> System.out.println(k+"   "+v));
		
		System.out.println("***********************");
		//map.keySet().stream().filter(k-> k > 5);//.map(k->k).collect(Collectors.toList());
		Map<Integer, String> map1 =   map.entrySet()
					.stream()
					.filter(k-> k.getKey().intValue() > 5)
					.collect(Collectors.toMap(k->k.getKey(),k->k.getValue()));
		
		map1.forEach((k,v) -> System.out.println(k+"   "+v));
		
		/*
		 * List<Integer> list1 = map.entrySet() .stream() .filter(k->
		 * k.getKey().intValue() > 5) .collect(Collectors.toList(k->k.getKey()));
		 */
	}

}
