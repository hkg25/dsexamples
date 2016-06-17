package com.searchAlgos;

/**
 * Interpolation search (sometimes referred to as extrapolation search) is an
 * algorithm for searching for a given key value in an indexed array that has
 * been ordered by the values of the key. It parallels how humans search through
 * a telephone book for a particular name, the key value by which the book's
 * entries are ordered. In each search step it calculates where in the remaining
 * search space the sought item might be, based on the key values at the bounds
 * of the search space and the value of the sought key, usually via a linear
 * interpolation. The key value actually found at this estimated position is
 * then compared to the key value being sought. If it is not equal, then
 * depending on the comparison, the remaining search space is reduced to the
 * part before or after the estimated position. This method will only work if
 * calculations on the size of differences between key values are sensible
 * 
 * On average the interpolation search makes about log(log(n)) comparisons (if
 * the elements are uniformly distributed), where n is the number of elements to
 * be searched. In the worst case (for instance where the numerical values of
 * the keys increase exponentially) it can make up to O(n) comparisons.
 * 
 * 
 * Let’s say there’s an array with user data, sorted by their year of birth. We
 * know in advance that all users are born in the 80’s. In this case sequential
 * or even binary search can be slower than interpolation search.
 * 
 * @author hgarg
 *
 */
public class InterpolationSearch {

	public static int interpolation_search(int arr[], int size, int key) {
		int low = 0;
		int high = size - 1;
		int mid;

		while (arr[high] != arr[low] && key >= arr[low] && key <= arr[high]) {
			mid = low + ((key - arr[low]) * (high - low) / (arr[high] - arr[low]));

			if (arr[mid] < key)
				low = mid + 1;
			else if (key < arr[mid])
				high = mid - 1;
			else
				return mid;
		}

		if (key == arr[low])
			return low;
		else
			return -1;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(interpolation_search(ar, ar.length, 9));
	}

}
