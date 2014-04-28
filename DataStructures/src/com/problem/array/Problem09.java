package com.problem.array;

import javax.sound.sampled.ReverbType;

public class Problem09 {

	
	private static void reverseArray(int arr[]){
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,5,8,6,12};
		System.out.println("After reversing");
		reverseArray(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		

	}

}
