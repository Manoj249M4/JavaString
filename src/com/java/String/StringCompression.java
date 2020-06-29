package com.java.String;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println(compressString("aabcccccaaa"));
	}

	/*
	 * method to perform basic string compression using the counts of repeated
	 * characters. For example, the string aabcccccaaa would become a2b1c5a3
	 */

	public static String compressString(String text) {
		int length = text.length();
		if (length > 2) {
			String compressedText = "";
			char lastChar = text.charAt(0);
			int charCount = 1;
			for (int i = 1; i < length; i++) {
				if (text.charAt(i) == lastChar) {
					charCount++;
				} else {
					compressedText += Character.toString(lastChar) + Integer.toString(charCount);
					lastChar = text.charAt(i);
					charCount = 1;
				}
			}
			compressedText += Character.toString(lastChar) + Integer.toString(charCount);
			if (compressedText.length() < length) {
				return compressedText;
			}
		}

		return text;
	}
}
