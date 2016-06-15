package com.sortAlgos;

import java.util.Arrays;
import java.util.List;

public class CountingSort extends AbstractSort {

	@Override
	public void sort(int[] array) {

	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 7, 7, 7, 5, 5, 2 };
		CountingSort countingSort = new CountingSort();
		countingSort.sort(array);
		countingSort.printArray(array);
		
		
		List<Integer> menu = Arrays.asList(1, 2, 4, 6);
		
	}

}


