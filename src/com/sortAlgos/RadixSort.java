package com.sortAlgos;

/**
 * The idea of Radix Sort is to do digit by digit sort starting from least
 * significant digit to most significant digit. Radix sort uses counting sort as
 * a subroutine to sort.
 * 
 * @author hgarg
 *
 */
public class RadixSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		// Find the maximum number to know number of digits
		int length = array.length;
		int max = getMax(array, length);
		// Do counting sort for every digit. Note that instead
		// of passing digit number, exp is passed. exp is 10^i
		// where i is current digit number
		for (int exp = 1; max / exp > 0; exp *= 10) {
			countSort(array, length, exp);
		}
	}

	private void countSort(int[] array, int length, int exp) {
		int[] output = new int[length];
		int i;
		int[] count = new int[10];
		// Arrays.fill(count, 0); // Not needed as it default has zero values

		// Store count of occurrences in count[]
		for (i = 0; i < length; i++) {
			count[(array[i] / exp) % 10]++;
		}

		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		// Build the output array
		for (i = length - 1; i >= 0; i--) {
			output[count[(array[i] / exp) % 10] - 1] = array[i];
			count[(array[i] / exp) % 10]--;
		}

		// Copy the output array to array[], so that array[] now
		// contains sorted numbers according to current digit
		System.arraycopy(output, 0, array, 0, length);
		/*for (i = 0; i < length; i++)
			array[i] = output[i];*/
	}

	private int getMax(int[] array, int length) {
		int max = array[0];
		for (int i = 1; i < length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		RadixSort radixSort = new RadixSort();
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		radixSort.sort(arr);
		radixSort.printArray(arr);
	}

}
