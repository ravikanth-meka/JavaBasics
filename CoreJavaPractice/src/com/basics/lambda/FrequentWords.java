package com.basics.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * Given a Text string, return the top 'K' frequent occurring words in ascending
 * order. Words must be non-trivial. Trivial words are combination of
 * Prepositions (to, at, of, with), Articles (the, a, an) and Conjunctions (and,
 * but, so)
 */

public class FrequentWords {

	public static void main(String[] args) throws Exception {
		String text = "Considering how common illness is, how tremendous the spiritual change that it brings, how astonishing, when the lights of health go down, the undiscovered countries that are then disclosed, what wastes and deserts of the soul a slight attack of influenza brings to view, what precipices and lawns sprinkled with bright flowers a little rise of temperature reveals, what ancient and obdurate oaks are uprooted in us by the act of sickness, how we go down into the pit of death and feel the water of annihilation close above our heads and wake thinking to find ourselves in the presence of the angels and harpers when we have a tooth out and come to the surface in the dentist’s arm-chair and confuse his “Rinse the Mouth rinse the mouth” with the greeting of the Deity stooping from the floor of Heaven to welcome us when we think of this, as we are frequently forced to think of it, it becomes strange indeed that illness has not taken its place with love and battle and jealousy among the prime themes of literature.";

		List<String> trivialWords = Arrays.asList("a", "and", "of", "are", "the", "to", "in", "it", "with", "but", "so",
				"at");

		FrequentWords.runTests(text, trivialWords);

	}

	private List<String> frequentWords(String text, int k, List<String> trivialWords) {

		List<String> totString = Arrays.asList(text.split(" "));

		/*
		 * List<String> filteredWords = (List<String>) totString.stream() .filter(word
		 * -> trivialWords.stream().filter(trword -> !word.equals(trword))).collect(Collectors.toList());
		 */
		// approach 1
		/*
		 * not working List<String> filteredWords = totString.stream() 
		 * .filter(line -> trivialWords.stream().allMatch(s -> s.equalsIgnoreCase(s)))
		 * .collect(Collectors.toList());
		 */

		List<String> filteredWords = totString.stream()
				.filter(word -> !trivialWords.stream().collect(Collectors.toSet()).contains(word))
				.collect(Collectors.toList());

		Map<String, Integer> wordCntMap = new HashMap<>();
		filteredWords.forEach(word -> {
			if (wordCntMap.get(word) != null)
				wordCntMap.put(word, wordCntMap.get(word) + 1);
			else
				wordCntMap.put(word, 1);

		});

		List<String> finalList = new ArrayList<>();

		/*
		 * List<Entry<String, Integer>> freqwords = wordCntMap.entrySet().stream()
		 * .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) .limit(k)
		 * .collect(Collectors.toList());
		 */

		List<Entry<String, Integer>> freqwords = wordCntMap.entrySet().stream()
				.sorted((c1, c2) -> c2.getValue() - c1.getValue()).limit(k).collect(Collectors.toList());

		freqwords.forEach(e -> finalList.add(e.getKey()));

		return finalList;

	}

	public static void runTests(String text, List<String> trivialWords) {

		FrequentWords s = new FrequentWords();

		List<String> words = s.frequentWords(text, 8, trivialWords);

		System.out
				.println(Arrays.asList("how", "illness", "that", "think", "us", "we", "what", "when").containsAll(words)
						? "pass test 1"
						: "Failed test 1");
		System.out.println(
				Arrays.asList("how", "illness", "that", "think", "us", "we", "text").containsAll(words) ? "pass test2"
						: "Failed test 2");

		words = s.frequentWords(text, 15, trivialWords);
		System.out.println(Arrays.asList("above", "annihilation", "go", "greeting", "how", "illness", "precipices",
				"that", "themes", "think", "us", "wastes", "we", "what", "when").containsAll(words) ? "pass test 3"
						: "Failed test 3");

	}

}
