package com.basics.lambda;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		int n = 6;
		float f = 3.12f;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
			{
				if ((i + j) > n) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		IntStream.rangeClosed(1, n).forEach(i -> System.out.println(i));

		IntStream.rangeClosed(1, n).forEach(i -> {
			IntStream.rangeClosed(1, n).forEach(j -> {
				if ((i + j) > n) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}

			});
			System.out.println();
		});

	}

}
