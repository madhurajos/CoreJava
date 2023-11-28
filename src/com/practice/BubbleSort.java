package com.practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,9,6,10,0,12};
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		//-----
		int size = arr.length;
		//Traverse through every element
		for(int i = 0;i < size-1;i++) {
			int min = i;
			for(int j = i+1;j < size;j++) {
				if(arr[j] < arr[min])
					min = j;//Find the index of smallest element
				
			}
			
			//Swich
			int temp = arr[min];//Store the the smallest number in temp
			arr[min] = arr[i];//Switch
			arr[i] = temp;//Store smallest number on ith location
			
			System.out.println("inside loop :: "+Arrays.toString(arr));
		}
		
		System.out.println("Sorted :: "+Arrays.toString(arr));
	}

}
