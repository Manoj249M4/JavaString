package com.java.datastructures;

public class MergeSort1 {

	private int[] array;
	private int[] tempMergeArray;
	private int length;

	public static void main(String[] args) {
		int[] inputArray = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MergeSort1 mms = new MergeSort1();
		mms.sort(inputArray);
		for (int i : inputArray) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	public void sort(int[] inputArray) {
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergeArray = new int[length];
		doMergeSort(0, length - 1);
	}

	public void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle + 1, higherIndex);
			mergeParts(lowerIndex, higherIndex, middle);

		}
	}

	private void mergeParts(int lowerIndex, int higherIndex, int middle) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergeArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			if (tempMergeArray[i] <= tempMergeArray[j]) {
				array[k] = tempMergeArray[i];
				i++;
			} else {
				array[k] = tempMergeArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergeArray[i];
			k++;
			i++;
		}
	}
}