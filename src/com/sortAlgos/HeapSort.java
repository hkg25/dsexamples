package com.sortAlgos;

public class HeapSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		int n = array.length;

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(array, n, i);

		// One by one extract an element from heap
		for (int i = n - 1; i >= 0; i--) {
			// Move current root to end
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			// call max heapify on the reduced heap
			heapify(array, i, 0);
		}

	}

	// To heapify a subtree rooted with node i which is
	// an index in array[]. n is size of heap
	private void heapify(int[] array, int n, int i) {
		int largest = i; // initialize largest as root
		int leftNode = 2 * i + 1; // left node
		int rightNode = 2 * i + 2; // right node
		// if left node is larger than root node
		if (leftNode < n && array[leftNode] > array[largest])
			largest = leftNode;

		// if left node is larger than root node
		if (rightNode < n && array[rightNode] > array[largest])
			largest = rightNode;

		// if largest is not the root
		if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			// Recursively call to heapify
			heapify(array, n, largest);
		}
	}

	public static void main(String[] args) {
		HeapSort heapSort = new HeapSort();
		int arr[] = { 1, 4, 6, 2, 34, 23, 12, 9, 8, 22 };
		heapSort.sort(arr);
		heapSort.printArray(arr);
	}

}
