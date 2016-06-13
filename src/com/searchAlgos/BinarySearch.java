package com.searchAlgos;

public class BinarySearch {

	/**
	 * Find the element in an array using binary search and return the index of
	 * element Assumption: Array should be sorted for binary search
	 * 
	 * @param arr
	 * @param elem
	 * @return
	 */
	public static int search(int[] arr, int startIndex, int endIndex, int elem) {
		int index = -1;
		// So that if both index are out of range of int the code will not break
		int mid = startIndex + (endIndex - startIndex) / 2;
		if (arr[mid] == elem) {
			index = mid;
		} else if (arr[mid] > elem) {
			index = search(arr, 1, mid - 1, elem);
		} else {
			index = search(arr, mid + 1, endIndex, elem);
		}
		return index;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(search(ar, 0, ar.length, 9));
	}

}
