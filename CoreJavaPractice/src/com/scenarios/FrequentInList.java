package com.scenarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentInList {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		l.add("abc");
		l.add("cde");
		l.add("def");
		l.add("ghi");
		l.add("abc");
		l.add("jkl");
		l.add("mno");
		l.add("def");
		l.add("bcd");
		l.add("def");
		l.add("asd");
		

		 Map<String, Long> StringAndCount= l.stream()
				 							.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	 	
		 Map<Object, List<Object>> CountAndString= StringAndCount.entrySet().stream()
				 									.collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		 
		 
		 Map<Object, Object> sorted = CountAndString.entrySet().stream()
		//.sorted((o1, o2) -> ((Long) o2.getKey()).compareTo((Long) o1.getKey())).map(Map.Entry::getValue)
		.sorted((o1, o2) -> ((Long) o2.getKey()).compareTo((Long) o1.getKey()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		 
		 List<String> result = l.stream()
				 	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				    .entrySet().stream()
				    .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				    .entrySet().stream().max((o1, o2) -> o1.getKey().compareTo(o2.getKey())).map(Map.Entry::getValue)
				    .orElse(Collections.emptyList());
		
		 result.forEach(e->System.out.println(e));

		 
		 
		 
		 
		 List<Person> personList  = new ArrayList<>();
		 personList.add(new Person("ravi",23,"asdf", "charlotte"));
		 personList.add(new Person("ravi2",25,"asdf", "fortmill"));
		 personList.add(new Person("ravi3",27,"asdf", "cary"));
		 personList.add(new Person("ravi4",23,"asdf", "detroit"));
		 personList.add(new Person("ravi5",35,"asdf", "charlotte"));
		 personList.add(new Person("ravi6",22,"asdf", "detroit"));
		 
		 String stringStream = "abcd edfg abcd efgh zser";
		 //The following will accumulate strings into an ArrayList: 
		 List<String> asList = l.stream().collect(Collectors.toList());

		 //The following will classify Person objects by city: 
		 Map<String, List<Person>> peopleByCity
		          = personList.stream().collect(Collectors.groupingBy(Person::getCity));

		 //The following will classify Person objects by state and city,cascading two Collectors together: 
		 Map<Integer, Map<String, List<Person>>> peopleByAgeAndCity
		          = personList.stream().collect(Collectors.groupingBy(Person::getAge,
		                                                       Collectors.groupingBy(Person::getCity)));

		 
	}

}

