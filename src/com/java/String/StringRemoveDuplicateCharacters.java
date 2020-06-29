package com.java.String;

import java.util.HashSet;
import java.util.Set;

public class StringRemoveDuplicateCharacters {

	public static void main(String[] args) {
		String[] testData = { "aabscs", "abcd", "aaaa", null, "", "aaabbb", "abababa" };
		for (String input : testData) {
			System.out.printf("Input : %s  Output: %s %n", input, removeDuplicates(input));
		}
		String str = "aabscs";
		System.out.println(removeDuplicatesUsingSet(str));
		char[] charecters = str.toCharArray();
		boolean[] found = new boolean[256];
		StringBuilder sb = new StringBuilder();
		for (char c : charecters) {
			if (!found[c]) {
				found[c] = true;
				sb.append(c);
			}
		}
		System.out.println("String after duplicates removed : " + sb.toString());
		System.out.println(removeDulicatesUsingIndexOf(str));

	}

	public static String removeDuplicates(String word) {

		if (word == null || word.length() < 2) {
			return word;
		}

		int pos = 1;
		char[] charecters = word.toCharArray();
		for (int i = 1; i < charecters.length; i++) {
			int j;
			for (j = 0; j < pos; j++) {
				if (charecters[i] == charecters[j]) {
					break;
				}
			}
			if (j == pos) {
				charecters[pos] = charecters[i];
				pos++;
			} else {
				charecters[pos] = 0;
				pos++;
			}

		}
		return toUniqueString(charecters);

	}

	public static String toUniqueString(char[] letters) {
		StringBuilder sb = new StringBuilder(letters.length);
		for (char c : letters) {
			if (c != 0) {
				sb.append(c);
			}
		}
		return sb.toString();

	}

	public static String removeDuplicatesUsingSet(String input) {
		char[] charecters = input.toCharArray();
		Set<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (char ch : charecters) {
			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}

		return sb.toString();
	}
	
	public static String removeDulicatesUsingIndexOf(String input){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int index = input.indexOf(ch, i + 1);
			if (index == -1) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	
	

}
