package com.java.String;

public class StringRemoveRepeatedChar {

	static final int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String mask_str = "mask";
		System.out.println(removeRepeatedCharFromBothString(str, mask_str));
	}

	static int[] getCharCountArray(String str) {
		int[] count = new int[NO_OF_CHARS];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		return count;
	}

	public static String removeRepeatedCharFromBothString(String str1, String str2) {
		int[] count = getCharCountArray(str2);
		int ip_ind = 0, res_ind = 0;

		char[] arr = str1.toCharArray();

		while (ip_ind != arr.length) {

			char temp = arr[ip_ind];
			if (count[temp] == 0) {
				arr[res_ind] = arr[ip_ind];
				res_ind++;
			}
			ip_ind++;
		}

		str1 = new String();

		return str1.substring(0, res_ind);
	}
}
