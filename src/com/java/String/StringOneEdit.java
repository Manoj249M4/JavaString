package com.java.String;

public class StringOneEdit {

	public static void main(String[] args) {
		if (isOneEdit("pale", "pal")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static boolean isOneEdit(String first, String second) {
		if (first.equals(second)) {
			return false;
		}

		int len1 = first.length();
		int len2 = second.length();

		if (len1 - len2 > 1 || len2 - len1 > 1) {
			return false;
		}
		int j = 0, i = 0, diff = 0;

		while (i < len1 && j < len2) {
			char f = first.charAt(i);
			char s = second.charAt(j);
			if (f != s) {
				diff++;
				if (len1 > len2) {
					i++;
				}
				if (len2 > len1) {
					j++;
				}
				if (len1 == len2) {
					i++;
					j++;
				}
			} else {
				i++;
				j++;
			}
			if (diff > 1) {
				return false;
			}
			// If the length of the string is not same. ex. "abc" and "abde" are
			// not one edit distance.
			if (diff == 1 && len1 != len2 && (i != len1 || j != len2)) {
				return false;
			}
		}
		return true;
	}

}
