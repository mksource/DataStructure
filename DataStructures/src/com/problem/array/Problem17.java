package com.problem.array;
/* 
 * Fixed point in ascending sorted array where elements are distinct is an element such that arr[i]=i
 */

public class Problem17 {
	
	
	private static int  binarysearch(int arr[],int low,int high){
		
		
		if(high>=low){
			
		
		int mid=low+(high-low)/2;
		
		if(mid == arr[mid])
			return mid;
		if(mid > arr[mid])
			return binarysearch(arr,mid+1,high);
		else
			return binarysearch(arr,low,mid-1);
		}	
		return -1;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[]={-10,-1,0,3,10,11,30,50,100};
		 System.out.println("Fixed point in the array is "+binarysearch(arr,0,arr.length-1));
	}

}
