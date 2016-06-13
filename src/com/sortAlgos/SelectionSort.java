package com.sortAlgos;

/**
 * In selection sort find out the min element and place it in first place and
 * repeat the process.
 * 
 * @author hgarg
 *
 */
public class SelectionSort extends AbstractSort {

	public void sort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			// If minIndex is same then no need to swap
			if (minIndex != i) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}


	public static void main(String[] args) {
		SelectionSort select = new SelectionSort();
		int arr[] = { 1, 4, 6, 2, 34, 23, 12, 9, 8, 22 };
		select.sort(arr);
		select.printArray(arr);
	}

}
