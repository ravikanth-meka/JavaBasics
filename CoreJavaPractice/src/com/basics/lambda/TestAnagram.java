package com.basics.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestAnagram {

	static void isAnagram(String s1, String s2) {
		// Removing all white spaces from s1 and s2

		String copyOfs1 = s1.replaceAll("\\s", "");

		String copyOfs2 = s2.replaceAll("\\s", "");

		// Initially setting status as true

		boolean status = true;

		if (copyOfs1.length() != copyOfs2.length()) {
			// Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

			status = false;
		} else {
			// Changing the case of characters of both copyOfs1 and copyOfs2 and converting
			// them to char array

			char[] s1Array = copyOfs1.toLowerCase().toCharArray();

			char[] s2Array = copyOfs2.toLowerCase().toCharArray();

			// Sorting both s1Array and s2Array

			Arrays.sort(s1Array);

			Arrays.sort(s2Array);

			// Checking whether s1Array and s2Array are equal

			status = Arrays.equals(s1Array, s2Array);
			/*
			 * Predicate<char[]> s2list = s -> ! strList2.stream().anyMatch(mc -> s.equals(mc));
			 * Arrays.asList(s1Array).stream().filter(s2list).collect(Collectors.toList());
			 */

		}

		// Output

		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	static void isAnagram1(String[] s1, String[] s2) {
		String[] strList = new String[4];
		strList[0] = "a";
		strList[1] = "jk";
		strList[2] = "bbc";
		strList[3] = "mn";

		String[] strList2 = new String[4];
		strList2[0] = "bb";
		strList2[1] = "kj";
		strList2[2] = "abb";
		strList2[3] = "op";

		List<String> strings = new ArrayList<String>(Arrays.asList(strList));

		List<String> strings2 = new ArrayList<String>(Arrays.asList(strList2));

		List<String> availableInBoth = strings.stream().filter(e -> !strings2.contains((String) e))
				.collect(Collectors.toList());

		/*
		 * List<String> availableInBoth1 = strList.stream().
		 * filter(e ->  strList2.contains(e)).collect(Collectors.toList());
		 * 
		 * 
		 * Predicate<String> notIn2 = s -> ! strList2.stream().anyMatch(mc -> s.equals(mc)); 
		 * List<String> s3 = strList.stream().filter(notIn2).collect(Collectors.toList());
		 * 	
		 */

		/*
		 * System.out.println("TEST"); s3.forEach(e -> System.out.println(e));
		 */
		System.out.println("\n\n");
		System.out.println("TEST111");
		availableInBoth.forEach(e -> System.out.println(e));
		System.out.println("\n\n");
		System.out.println("TEST1 222");
		/*
		 * availableInBoth1.forEach(e -> System.out.println(e));
		 * System.out.println("TEST1 333");
		 */

	}

	public static void main(String[] args) {

		isAnagram("a", "bb");
		isAnagram("jk", "kj");
		isAnagram("bbc", "abb");
		isAnagram("mn", "op");
		isAnagram("abc", "def");

		/*
		 * isAnagram("Mother In Law", "Hitler Woman");
		 * 
		 * isAnagram("keEp", "peeK");
		 * 
		 * isAnagram("SiLeNt CAT", "LisTen AcT");
		 * 
		 * isAnagram("Debit Card", "Bad Credit");
		 * 
		 * isAnagram("School MASTER", "The ClassROOM");
		 * 
		 * isAnagram("DORMITORY", "Dirty Room");
		 * 
		 * isAnagram("ASTRONOMERS", "NO MORE STARS");
		 * 
		 * isAnagram("Toss", "Shot");
		 * 
		 * isAnagram("joy", "enjoy");
		 */
	}

}
