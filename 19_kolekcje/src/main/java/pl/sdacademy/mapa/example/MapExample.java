package pl.sdacademy.mapa.example;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		//peppersExample();
		countWordsExample();

	}

	private static void countWordsExample() {
		String anyString = "Zgodnie z pierwotną metodyką ostrości w skali Scoville'a wyznaczono " +
			"organoleptycznie.";

		List<String> listofWords = Arrays.asList(anyString.split("\\s"));
		Map<String, Integer> words = new HashMap<>();
		for (String word : listofWords) {
			if (words.containsKey(word)) {
				words.put(word, words.get(word) + 1);
			}else {
				words.put(word,1);
			}

		}

		System.out.println(words);

	}

	private static void peppersExample() {
		Map<String, Integer> peppers = new HashMap<>();
		peppers.put("Peperoni", 100);
		peppers.put("Jalapeno", 2500);
		peppers.put("Habanero", 100_000);
		peppers.put("PepperX", 3_180_000);

		System.out.println(peppers);
		System.out.println(peppers.get("PepperX"));
		System.out.println(peppers.entrySet());

		for (Map.Entry<String, Integer> entry : peppers.entrySet()) {
			if (entry.getValue() == 2_500) {
				System.out.println(entry.getKey());

			}

		}
	}

}