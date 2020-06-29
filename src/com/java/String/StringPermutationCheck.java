package com.java.String;

import java.util.Arrays;

public class StringPermutationCheck {

	static int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		if (arePermutation1("test", "stte")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		if (arePermutation2(("test").toCharArray(), ("swte").toCharArray())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	// Complexity O(n^2)
	public static boolean arePermutation1(String str1, String str2) {
		int n1 = str1.length();
		int n2 = str2.length();

		if (n1 != n2) {
			return false;
		}

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < n1; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}

		}
		return true;

	}

	public static boolean arePermutation2(char[] str1, char[] str2) {

		int[] count1 = new int[NO_OF_CHARS];
		Arrays.fill(count1, 0);
		int[] count2 = new int[NO_OF_CHARS];
		Arrays.fill(count2, 0);

		for (int i = 0; i < str1.length && i < str2.length; i++) {
			count1[str1[i]]++;
			count2[str2[i]]++;
		}

		if (str1.length != str2.length) {
			return false;
		}
		for (int i = 0; i < NO_OF_CHARS; i++) {
			if (count1[i] != count2[i]) {
				return false;
			}
		}
		return true;
	}
}
