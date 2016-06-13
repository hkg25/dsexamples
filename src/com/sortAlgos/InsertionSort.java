package com.sortAlgos;

public class InsertionSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		int length = array.length;
		for (int i = 1; i < length; i++) {
			int key = array[i];
			int j = i - 1;
			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one
			 * position ahead of their current position
			 */
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int arr[] = { 1, 4, 6, 2, 34, 23, 12, 9, 8, 22 };
		insertionSort.sort(arr);
		insertionSort.printArray(arr);
	}
}
