package com.java.datastructures;

public class InsertionSort {
	public static void main(String... args) {
		int arr[] = { 10, 20, 15, 30, 5, 75 };
		insertionSort(arr);
	}

	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int valueToSort = array[i];
			int j;
			for (j = i; j > 0 && array[j - 1] > valueToSort; j--) {
				array[j] = array[j - 1];
			}
			array[j] = valueToSort;
			System.out.print("Iteration " + (i) + ": ");
			printArray(array);
		}

		return array;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
