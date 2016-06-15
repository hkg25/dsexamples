package com.sortAlgos;

/**
 * Bucket sort is mainly useful when input is uniformly distributed over a
 * range. For example, consider the following problem. Sort a large set of
 * floating point numbers which are in range from 0.0 to 1.0 and are uniformly
 * distributed across the range. How do we sort the numbers efficiently?
 * 
 * 
 * Counting sort can not be applied here as we use keys as index in counting
 * sort. Here keys are floating point numbers.
 * 
 * @author hgarg
 *
 */
public class BucketSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		
	}

	public static void main(String[] args) {
		BucketSort bucketSort = new BucketSort();
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		bucketSort.sort(arr);
		bucketSort.printArray(arr);
	}

}
