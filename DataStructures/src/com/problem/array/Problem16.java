package com.problem.array;
/*
 * Given an array of elements A[0..n-1] a subarray A[i...j] is called bitonic
 * if there is a k such that i<=k<j and A[i]<=A[i+1]...<A[k]>...A[j-1]>A[j]
 * 
 * 
 * Step 1. Construct an auxiliary array inc from left to right such that inc[i] is length of nondecreasing 
 *         subarray ending at arr[i] 
 * 
 * Step 2. Construct an auxiliary array dec from right to left such that dec[i] is the length of the non increasing
 *         array ending at arr[i]
 *         
 * Step 3. Find max(inc[i]+dec[i]-1)        
 *     
 */

public class Problem16 {

	
	private static int findbitonic(int arr[]){
		
		int size=arr.length;
		int inc[]=new int[size];
		int dec[]=new int[size];
		int maxsize=0;
		
		inc[0]=1;
		for(int i=1;i<size;i++){
			
			if(arr[i]>arr[i-1])
				inc[i]=inc[i-1]+1;
			else
				inc[i]=1;
			
		}
		
		dec[size-1]=1;
		for(int i=size-2;i>=0;i--){
			if(arr[i+1]<arr[i])
				dec[i]=dec[i+1]+1;
			else
				dec[i]=1;
		}
		
		for(int i=0;i<size;i++){
			if((inc[i]+dec[i]-1)>maxsize)
				maxsize=inc[i]+dec[i]-1;
		}
		
		return maxsize;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]={12,4,78,90,45,23};
		int arr2[]={10,20,30,40};
		int arr3[]={40,30,20,10};
		
		System.out.println("Bitonic subarray size "+findbitonic(arr1));
		System.out.println("Bitonic subarray size is"+findbitonic(arr2));
		System.out.println("Bitonic subarray size is "+findbitonic(arr3));

	}

}
