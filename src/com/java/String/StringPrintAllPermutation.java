package com.java.String;

import java.util.HashSet;
import java.util.Set;

public class StringPrintAllPermutation {

	public static void main(String[] args) {
		String s3 = "abc";
		printPermutation(s3, "");
		System.out.println("======================");
		printPermutationItretive(s3);
		String s = "AAC";
		String s1 = "ABC";
		String s2 = "ABCD";
		System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
		System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
		System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
		System.out.println("======================");
		int n = s1.length();
		calculate(s1, 0, n - 1);
	}

	static void printPermutation(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutation(ros, ans + ch);
		}

	}

	public static void printPermutationItretive(String str) {
		int[] factorials = new int[str.length() + 1];
		factorials[0] = 1;
		for (int i = 1; i < str.length(); i++) {
			factorials[i] = factorials[i - 1] * i;
		}
		for (int i = 0; i < str.length(); i++) {
			String onePermutation = "";
			String temp = str;
			int positionCode = i;
			for (int position = str.length(); position > 0; position--) {
				int selected = positionCode / factorials[position - 1];
				onePermutation += temp.charAt(selected);
				positionCode = positionCode % factorials[position - 1];
				temp = temp.substring(0, selected) + temp.substring(selected + 1);
			}
			System.out.println(onePermutation);
		}
	}

	public static Set<String> permutationFinder(String str) {

		Set<String> perm = new HashSet<>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0); // first character
		String rem = str.substring(1); // Full string without first character
		Set<String> words = permutationFinder(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;
	}

	public static String charInsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}

	/*==============================================================*/
	
	private static void calculate(String str, int left, int right) {
		if (left == right) {
			System.out.println(str);
		} else {
			for (int i = left; i <= right; i++) {
				String swapped = swap(str, left, i);
				calculate(swapped, left + 1, right);
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
