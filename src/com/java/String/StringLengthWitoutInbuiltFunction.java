package com.java.String;

public class StringLengthWitoutInbuiltFunction {

	public static void main(String[] args) {
		System.out.println(findStringLength("This is hello world"));
		System.out.println(findLengthUsingException("Java is great!"));
	}

	public static int findStringLength(String str) {

		int counter = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			counter++;
		}
		return counter;
	}

	public static int findLengthUsingException(String str) {
		int i = 0;
		try {
			for (i = 0;; i++) {
				str.charAt(i);
			}
		} catch (Exception e) {

		}

		return i;
	}

}
