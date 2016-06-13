package com.sortAlgos;

public abstract class AbstractSort implements Sort {

	public abstract void sort(int[] array);

	@Override
	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
