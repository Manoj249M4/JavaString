package com.java.String;

import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringAnagramCheck {

	public static void main(String[] args) {
		System.out.println(isAnagram("word", "wwdo"));
		System.out.println(checkAnagaram("mary", "army"));
		System.out.println(iAnagram("stop", "toos"));
	}

	public static boolean isAnagram(String word, String anagram) {

		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

	public static boolean checkAnagaram(String first, String second) {
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return sbSecond.length() == 0 ? true : false;
	}

	public static boolean iAnagram(String word, String anagram) {
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);
	}

	public class StringAnagramTest{
		
		@Test
		public void testIsAnagram(){
			assertTrue(StringAnagramCheck.iAnagram("word", "wrdo"));
		}
	}
}

