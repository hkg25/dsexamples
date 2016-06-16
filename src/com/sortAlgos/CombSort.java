package com.sortAlgos;

/**
 * Comb Sort is mainly an improvement over Bubble Sort. Bubble sort always
 * compares adjacent values. So all inversions are removed one by one. Comb Sort
 * improves on Bubble Sort by using gap of size more than 1. The gap starts with
 * a large value and shrinks by a factor of 1.3 in every iteration until it
 * reaches the value 1. Thus Comb Sort removes more than one inversion counts
 * with one swap and performs better than Bublle Sort.
 * 
 * The shrink factor has been empirically found to be 1.3 (by testing Combsort
 * on over 200,000 random lists) [Source: Wiki]
 * 
 * Although, it works better than Bubble Sort on average, worst case remains
 * O(n2).
 * 
 * @author hgarg
 *
 */
public class CombSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		int length = array.length;
		int gap = length;

		boolean swapped = Boolean.TRUE;

		while (gap != 1 || swapped == true) {
			gap = getNextGap(gap);
			swapped = Boolean.FALSE;
			for (int i = 0; i < length - gap; i++) {
				if (array[i] > array[i + gap]) {
					// Swap array[i] and array[gap]
					int temp = array[i + gap];
					array[i + gap] = array[i];
					array[i] = temp;

					// Set swapped
					swapped = true;
				}
			}
		}
	}

	private int getNextGap(int gap) {
		return ((gap * 10) / 13) < 1 ? 1 : ((gap * 10) / 13);
	}

	public static void main(String[] args) {
		CombSort combSort = new CombSort();
		int array[] = { 8, 4, 1, 56, 3, -44, 23, -6, 28, 0 };
		combSort.sort(array);
		combSort.printArray(array);
	}

}
