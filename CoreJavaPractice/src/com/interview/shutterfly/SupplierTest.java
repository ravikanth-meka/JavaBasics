package com.interview.shutterfly;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		Supplier<String> i = () -> "Car";
		Consumer<String> c = x -> System.out.println(x.toLowerCase());
		
	}

}
