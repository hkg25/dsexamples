package com.sortAlgos;

/**
 * Merge sort is divide and conquer algo. Time complexity is O(nlogn)
 * 
 * @author Harish
 *
 */
public class MergeSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	private void sort(int[] array, int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			sort(array, l, mid);
			sort(array, mid + 1, r);
			merge(array, l, mid, r);
		}

	}

	private void merge(int[] array, int l, int mid, int r) {
		int sizeOfArray1 = mid - l + 1;
		int sizeOfArray2 = r - mid;

		// create two temp array of size
		int leftArr[] = new int[sizeOfArray1];
		int rightArr[] = new int[sizeOfArray2];

		// Copy data to arrays
		for (int i = 0; i < sizeOfArray1; i++)
			leftArr[i] = array[l + i];

		for (int j = 0; j < sizeOfArray2; j++)
			rightArr[j] = array[mid + 1 + j];

		// Merge two arrays
		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < sizeOfArray1 && j < sizeOfArray2) {
			if (leftArr[i] <= rightArr[j]) {
				array[k] = leftArr[i];
				i++;
			} else {
				array[k] = rightArr[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < sizeOfArray1) {
			array[k] = leftArr[i];
			i++;
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (j < sizeOfArray2) {
			array[k] = rightArr[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int arr[] = { 1, 4, 6, 2, 34, 23, 12, 9, 8, 22 };
		mergeSort.sort(arr);
		mergeSort.printArray(arr);
	}

}
