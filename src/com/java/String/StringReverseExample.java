package com.java.String;

public class StringReverseExample {
	public static void main(String[] args) {
		String str = "Three";
		System.out.println("Original String" + str);

		StringBuffer sb = new StringBuffer(str);
		String reverseStr = sb.reverse().toString();
		System.out.println("Reverse string in java using StringBuffer -->" + reverseStr);

		System.out.println("Reverse String in java using iteration -->" +  reverse(str));

		System.out.println("Reverse String in java using recursion -->" + reverseRecursively(str));
	}

	private static String reverse(String str) {
		StringBuilder strBuilder = new StringBuilder();
		char[] strChars = str.toCharArray();

		for (int i = strChars.length - 1; i >= 0; i--) {
			strBuilder.append(strChars[i]);
		}
		return strBuilder.toString();
	}

	private static String reverseRecursively(String str) {
		if (str.length() < 2) {
			return str;
		}
		return reverseRecursively(str.substring(1));
	}

}
