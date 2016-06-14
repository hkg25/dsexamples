package com.sortAlgos;

/**
 * QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and
 * partitions the given array around the picked pivot
 * 
 * @author Harish
 *
 */
public class QuickSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	private void sort(int[] array, int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(array, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(array, low, pi - 1);
			sort(array, pi + 1, high);
		}
	}

	private int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (array[j] <= pivot) {
				i++;
				// swap arr[i] and arr[j]
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int arr[] = { 1, 4, 6, 2, 34, 23, 12, 9, 8, 22 };
		quickSort.sort(arr);
		quickSort.printArray(arr);
	}

}
