package com.java.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringFirstNonRepeatedChar {

	public static void main(String[] args) {
		System.out.println(getFirstNonRepeatedCharOne("hello"));
		System.out.println(getFirstNonRepeatedCharTwo("ehllo"));
		System.out.println(getFirstNonRepeatedCharThree("ehllo"));
	}

	public static char getFirstNonRepeatedCharOne(String str) {

		Map<Character, Integer> counts = new LinkedHashMap<Character, Integer>(str.length());
		for (char ch : str.toCharArray()) {
			counts.put(ch, counts.containsKey(ch) ? counts.get(ch) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("Did't find any non repeated characters");
	}

	public static char getFirstNonRepeatedCharTwo(String word) {

		//Set<Character> setRepeating = new HashSet<>();
		List<Character> listNonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			/*if (repeating.contains(letter)) {
				continue;
			}*/
			if (listNonRepeating.contains(letter)) {
				listNonRepeating.remove((Character) letter);
				//setRepeating.add(letter);
			} else {
				listNonRepeating.add(letter);
			}
		}

		return listNonRepeating.get(0);
	}
	
	public static char getFirstNonRepeatedCharThree(String word){
		
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (map.containsKey(ch)){
				map.put(ch, map.get(ch) + 1);
			}else{
				map.put(ch, 1);
			}
		}
		
		char[] ch = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			char key = ch[i];
			if (map.get(key) == 1) {
				return key;
			}
		}
		throw new RuntimeException("undefined Behaviour");
	}
}
