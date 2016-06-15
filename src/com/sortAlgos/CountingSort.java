package com.sortAlgos;

/**
 * Counting sort is used for number in a range like 1 to k (k<=n) where n is the
 * size of array.
 * 
 * If numbers are in range from 1 to k*k then use radix sort
 * 
 * @author hgarg
 *
 */
public class CountingSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		int length = array.length;
		int i;
		int output[] = new int[length];
		// For integer array only. For character array it should be 255.
		int count[] = new int[10];
		for (i = 0; i < length; i++) {
			count[array[i]]++;
		}

		for (i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}

		for (i = length - 1; i > 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}

		System.arraycopy(output, 0, array, 0, length);

	}

	public static void main(String[] args) {

		int[] array = { 1, 1, 1, 7, 7, 7, 5, 5, 2, 4, 5, 3, 2, 4, 6, 7, 8, 9 };
		CountingSort countingSort = new CountingSort();
		countingSort.sort(array);
		countingSort.printArray(array);
	}

}
