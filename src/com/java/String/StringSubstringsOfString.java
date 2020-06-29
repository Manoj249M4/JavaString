package com.java.String;

public class StringSubstringsOfString {

	public static void main(String[] args) {
		String string = "abbc";
		StringSubstringsOfString str = new StringSubstringsOfString();
		System.out.println("All substring of " + string + " are");
		str.substringOfString(string);
	}

	public void substringOfString(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
