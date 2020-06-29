package com.java.String;

public class StringURLify {

	static int MAX = 1000;

	public static void main(String[] args) {

		replacesSpaces1("a r y v s ");
		char[] str = "Mr John Smith".toCharArray();
		str = replacesSpaces2(str);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}

	public static void replacesSpaces1(String str) {

		str = str.replaceAll("\\s", "%20");
		System.out.println(str);
	}

	public static char[] replacesSpaces2(char[] str) {
		int space_count = 0, i = 0;
		for (i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				space_count++;
			}
		}
		while (str[i - 1] == ' ') {
			space_count--;
			i--;
		}
		int new_length = i + space_count * 2;
		if (new_length > MAX) {
			return str;
		}

		int index = new_length - 1;
		char[] new_str = str;
		str = new char[new_length];
		for (int j = i - 1; j >= 0; j--) {
			if (new_str[j] == ' ') {
				str[index] = '0';
				str[index - 1] = '2';
				str[index - 2] = '%';
				index = index - 3;
			} else {
				str[index] = new_str[j];
				index--;
			}
		}

		return str;
	}
}
