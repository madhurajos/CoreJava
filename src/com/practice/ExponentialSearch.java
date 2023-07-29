package com.practice;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,9,6,10,0,12};
		
		System.out.println("Exponential search index :: "+exponentialSearch(arr, 10));
	}

	public static int exponentialSearch(int[] arr,int x) {
		
		int index = arr.length-1;
		
		// Need to sort the array
		Arrays.sort(arr);
		System.out.println("Sorted Array :: "+Arrays.toString(arr));
		
		if(arr[0] == x)
			return 0;
		
		int counter = 1;
		
		//counter <= index && arr[counter] <= x, double the counter to find the range where X is present
		while(counter <= index && arr[counter] <= x)
			counter = counter*2;
		
		//binary search counter/2 - counter
		//x has to be present between counter/2 and counter
		//Value of counter may have become greater than actual length of array due to doubling, hence,
		//need to use Math.min() to find the lowest from the two.
		int result = binarySearch(arr, counter/2, Math.min(counter,index), x);
		
		return result;
	}
	
	public static int binarySearch(int[] arr,int start,int end,int x) {
		
		while(start <= end) {
			int middle = start + (end-start)/2;
			
			if(arr[middle] == x)
				return middle;
			
			if(arr[middle] < x)
				start = middle+1;
			else
				end = middle-1;
					
		}
		
		return -1;
	}
}
