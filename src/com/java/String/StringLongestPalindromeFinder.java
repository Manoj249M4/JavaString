package com.java.String;

public class StringLongestPalindromeFinder {

	public static void main(String[] args) {
		// System.out.println(longestPalindromeString("1234"));
		//System.out.println(longestPalindromeString("12321"));
		System.out.println(longestPalindromeString("9912321456"));
		System.out.println(longestPalindromeString("9912333321456"));
		System.out.println(longestPalindromeString("12145445499"));
		System.out.println(longestPalindromeString("1223213"));
		System.out.println(longestPalindromeString("abb"));

	}

	public static String longestPalindromeString(String str) {

		if (str == null)
			return null;
		String longest = str.substring(0, 1);
		for (int i = 0; i < str.length(); i++) {
			// odd cases like 121
			String palindrome = intermidiatePalindrome(str, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			// even cases like 1221
			palindrome = intermidiatePalindrome(str, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}

	public static String intermidiatePalindrome(String str, int left, int right) {

		if (left > right) {
			return null;
		}
		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			// move left
			left--;
			// move right	
			right++;
		}
		return str.substring(left + 1, right);
	}
}
