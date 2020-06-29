package com.java.String;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter original string");
		String input = scr.nextLine();
		System.out.println("Please enter rotation of String");
		String rotation = scr.nextLine();
		if (checkRotation(input, rotation)) {
			System.out.println(input + " and " + rotation + " are rotation of each other");
		} else {
			System.out.println("Sorry, they are not rotation of each other");
		}

		scr.close();
		System.out.println(isRotation("waterbottle", "erbottlewat"));
		
	}

	public static boolean checkRotation(String original, String rotation) {
		if (original.length() != rotation.length()) {
			return false;
		}
		String concatinated = original + original;
		if (concatinated.indexOf(rotation) != -1) {
			return true;
		}
		return false;
	}

	public static boolean isRotation(String s1, String s2) {
		if (s1.length()!= s2.length()) {
			return false;
		}
		if (s1 == null || s2 == null) {
			return false;
		}
		return isSubstring(s1 + s1, s2);
	}

	private static boolean isSubstring(String s1, String s2) {
		return s1.contains(s2);
	}
}
