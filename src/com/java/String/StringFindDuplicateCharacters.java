package com.java.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringFindDuplicateCharacters {

	public static void main(String[] args) {
		printDuplicateCharacters("Programming");
		printDuplicateCharacters("Combination");
		printDuplicateCharacters("Java");
	}

	public static void printDuplicateCharacters(String words) {
		char[] characters = words.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> enterySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", words);
		for (Map.Entry<Character, Integer> entry : enterySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}
	}

}
