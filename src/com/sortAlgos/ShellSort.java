package com.sortAlgos;

/**
 * ShellSort is mainly a variation of Insertion Sort. In insertion sort, we move
 * elements only one position ahead. When an element has to be moved far ahead,
 * many movements are involved. The idea of shellSort is to allow exchange of
 * far items. In shellSort, we make the array h-sorted for a large value of h.
 * We keep reducing the value of h until it becomes 1. An array is said to be
 * h-sorted if all sublists of every h’th element is sorted.
 * 
 * @author hgarg
 *
 */
public class ShellSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		int length = array.length;

		// Start with a big gap, then reduce the gap
		for (int gap = length / 2; gap > 0; gap /= 2) {
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < length; i++) {
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				int temp = array[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
					array[j] = array[j - gap];

				// put temp (the original a[i]) in its correct
				// location
				array[j] = temp;
			}
		}

	}

	public static void main(String[] args) {
		ShellSort shellSort = new ShellSort();
		int arr[] = { 1, 4, 6, 2, 34, 23, 12, 9, 8, 22 };
		shellSort.sort(arr);
		shellSort.printArray(arr);
	}

}
