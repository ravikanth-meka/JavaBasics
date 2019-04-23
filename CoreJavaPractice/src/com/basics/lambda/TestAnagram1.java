package com.basics.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestAnagram1 {

	public static void main(String[] args) {
		getMinimumDifference2();
	}

	static int[] getMinimumDifference() {
		String[] a = new String[4];
		a[0] = "a";
		a[1] = "jk";
		a[2] = "bbc";
		a[3] = "mn";

		String[] b = new String[4];
		b[0] = "bb";
		b[1] = "kj";
		b[2] = "abb";
		b[3] = "op";

		int[] differenceCount = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			differenceCount[i] = 0;
			if (a[i].length() != b[i].length())
				differenceCount[i] = -1;
			else {
				char[] firstArray = a[i].toCharArray();
				char[] secArray = b[i].toCharArray();
				Arrays.sort(firstArray);
				Arrays.sort(secArray);

				if (Arrays.equals(firstArray, secArray)) {
					differenceCount[i] = 0;
				} else {
					List<Character> sec = new ArrayList<Character>();
					for (char c : secArray) {
						sec.add(c);
					}
					List<Character> fir = new ArrayList<Character>();
					for (char c : firstArray) {
						fir.add(c);
					}

					int count = 0;
					for (int j = 0; j < firstArray.length; j++)

					{
						if (!sec.contains(firstArray[j]))
							count++;

					}

					for (int k = 0; k < secArray.length; k++)

					{
						if (!fir.contains(secArray[k]))
							count++;
					}
					differenceCount[i] = count / 2;
				}
			}
		}
		Arrays.stream(a).collect(Collectors.groupingBy(s -> s))
				.forEach((k, v) -> System.out.println(k + " " + v.size()));
		return differenceCount;
	}

	static int[] getMinimumDifference2() {
		String[] a = new String[4];
		a[0] = "a";
		a[1] = "jk";
		a[2] = "bbc";
		a[3] = "mn";

		String[] b = new String[4];
		b[0] = "bb";
		b[1] = "kj";
		b[2] = "abb";
		b[3] = "op";

		int[] differenceCount = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			differenceCount[i] = 0;
			if (a[i].length() != b[i].length())
				differenceCount[i] = -1;
			else {

				a[i].chars().forEach(j -> System.out.println((char) j));

				// a[i].chars().forEach(j -> j.equals());

				a[i].chars().summaryStatistics().getCount();

			}
		}
		/*
		 * Arrays.stream(a) .collect(Collectors.groupingBy(s -> s)) .forEach((k, v) ->
		 * System.out.println(k+" "+v.size()));
		 */
		return differenceCount;
	}
}
