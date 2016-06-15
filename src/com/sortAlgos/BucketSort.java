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
 * bucketSort(array[], n) 
 * 1) Create n empty buckets (Or lists). 
 * 2) Do following
 * 		a) for every array element array[i]. .......a) Insert array[i] into bucket[n*array[i]] 
 * 3) Sort individual buckets using insertion sort. 
 * 4) Concatenate all sorted buckets.
 * 
 * @author hgarg
 *
 */
public class BucketSort extends AbstractSort {

	@Override
	public void sort(int[] array) {
		//TODO : Implement it 
	}

	public static void main(String[] args) {
		BucketSort bucketSort = new BucketSort();
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		bucketSort.sort(arr);
		bucketSort.printArray(arr);
	}

}
