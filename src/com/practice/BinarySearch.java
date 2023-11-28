package com.practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,2,9,6,10,0,12};
		
		//Finding the index of 10
		System.out.println(binarySearch(arr, arr.length, 4));
	}
	
	public static int binarySearch(int[] arr,int length,int x) {
		int counter = 1;
		int index = length-1;
		
		//1. First need to sort array
		Arrays.sort(arr);
		
		System.out.println("Sorted Array :: "+Arrays.toString(arr));
		
		while(counter <= index) {
			
			// 2. Find the middle index
			int middle = counter + (index-counter)/2;
			
			//3. If middle index is equal to the element we are looking for, then return
			if(arr[middle] == x)
				return middle;
			
			//4.If middle element is less than X,then ignore left half portion and set index to middle+1 to focus on right portion
			if(arr[middle] < x)
				counter = middle+1;
			else
				index = middle-1; //Else(If) middle element is greater than X, then ignore right half portion and set length = middle-1 
									//to focus on only left half 
				
		}
		
		//This point shows that element not present
		return -4; //added comment for git changes2
		//inline commit
	}
	
	public void testMethod() {
		System.out.println("Inside test method");
	}

}
