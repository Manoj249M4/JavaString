package com.java.datastructures;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 16, 6, 8, 10, 12, 14 };
		System.out.println("Key 14's position: " + binarySearch(arr, 14));
		int[] arr1 = { 6, 34, 78, 123, 432, 900 };
		System.out.println("Key 432's position: " + binarySearch(arr1, 432));
	}

	public static int binarySearch(int[] arr, int key) {

		//Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid]) {
				return mid;
			}
			if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
