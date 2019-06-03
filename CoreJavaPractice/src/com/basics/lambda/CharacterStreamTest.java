package com.basics.lambda;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterStreamTest {

	public static void main(String[] args) {
		
		String testString = "Hello world";
		//Stream<Object> stringStream = 
				testString.codePoints()
				  .mapToObj(c -> String.valueOf((char) c))
				  .collect(Collectors.toList())
			      .forEach(x-> System.out.println(x));


	}

}
