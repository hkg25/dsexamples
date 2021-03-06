package com.sortAlgos;

/**
 * In bubble sort compare each element with next one and swap if next is lesser
 * than the previous one. In this after each pass largest element will be at
 * last in array
 * 
 * @author hgarg
 *
 */
public class BubbleSort extends AbstractSort {

	public void sort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			boolean swapped = Boolean.FALSE;
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j + 1] && array[j] != array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					swapped = Boolean.TRUE;
				}
			}
			// If inner loop doesn't do swap then break the inner loop
			if (swapped == Boolean.FALSE) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		int arr[] = { 1, 4, 6, 2, 34, 23, 12, 9, 8, 22 };
		bubble.sort(arr);
		bubble.printArray(arr);
	}

}
