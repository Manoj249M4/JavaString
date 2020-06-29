package com.java.String;

import org.springframework.util.StringUtils;

public class StringCountCharacters {

	public static void main(String[] args) {
		String input = "Today is Saturday";
		// Using Spring framework StringUtils class for finding occurrence of
		// another String
		int count = StringUtils.countOccurrencesOf(input, "a");
		System.out.println("count of occurrence of character 'a' on String: "
				+ " Today is Saturday' using Spring StringUtils " + count);
		
		//counting occurrence of character with loop
		int charCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a') {
				charCount++;
			}
		}
		System.out.println("count of character 'a' on String: 'Today is Saturday' using for loop  " + charCount);
		
		// Using for each loop
		charCount = 0;
		for (char ch : input.toCharArray()) {
			if (ch == 'a') {
				charCount++;
			}
		}
		System.out.println("count of character 'a' on String: 'Today is Saturday' using for loop  " + charCount);
		
	}
}
