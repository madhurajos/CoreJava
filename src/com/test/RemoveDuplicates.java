package com.test;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println("Unique array "+removeDuplicates2(arr));
	}
	
    public static int removeDuplicates(int[] arr) {
        
    	int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    
    public static int removeDuplicates2(int[] arr) {
        
    	int j=1;
        for(int i=2;i<arr.length;i++)
            if(arr[i]!=arr[j-1])
            	arr[++j]=arr[i];
        return j+1;
    }

}
