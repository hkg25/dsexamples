package com.sortAlgos;

public class InsertionSort extends AbstractSort {

	@Override
	public void sort(int[] array) {

	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int arr[] = { 1, 4, 6, 2, 34, 23, 12, 9, 8, 22 };
		insertionSort.sort(arr);
		insertionSort.printArray(arr);
	}
}
