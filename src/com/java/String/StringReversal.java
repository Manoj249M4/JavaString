package com.java.String;

public class StringReversal {

	public static void main(String[] args) {
		System.out.println(reverse("abcdefghij"));
		reverseStringUsingForLoop("manoj");
	}

	public static String reverse(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		char[] characters = str.toCharArray();
		/*
		 * int i = 0; int j = characters.length - 1; while (i < j) {
		 * swap(characters, i, j); i++; j--; }
		 */

		for (int i = 0; i < characters.length / 2; i++) {
			char temp = characters[i];
			characters[i] = characters[characters.length - 1 - i];
			characters[characters.length - 1 - i] = temp;
		}
		return new String(characters);
	}

	public static void swap(char[] str, int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	public static void reverseStringUsingForLoop(String str) {
		String temp = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		System.out.println(temp);
	}
}
