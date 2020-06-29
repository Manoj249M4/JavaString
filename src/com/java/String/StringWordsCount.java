package com.java.String;

public class StringWordsCount {

	public static void main(String[] args) {
		System.out.println(wordCount("Java is best programming language"));
		System.out.println(countWords("Java is Great"));
	}

	public static int wordCount(String word) {

		if (word == null || word.isEmpty()) {
			return 0;
		}
		int count = 0;
		char[] ch = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			ch[i] = word.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
				count++;
			}
		}

		return count;
	}

	public static int countWords(String str) {

		if (str == null) {
			return 0;
		}

		String input = str.trim();
		int count = str.isEmpty() ? 0 : input.split("\\s+").length;
		return count;
	}
}
