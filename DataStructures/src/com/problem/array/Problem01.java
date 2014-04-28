package com.problem.array;

import com.ds.array.QuickSort;

public class Problem01 {

	
	//Using the method1 (using sorting)
	private static boolean method1(int arr[],int sum){
		
		int left=0;
		int right=arr.length-1;
		
		//Sort the array
		QuickSort sort=new QuickSort();
		sort.sort(arr);
		
		while(left<right){
			
			int temp=arr[left]+arr[right];
			
			if(temp==sum)
				return true;
			else if(temp < sum)
				left++;
			else
				right--;
		}
		return false;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,4,45,6,10,-8};
		int sum=16;
		System.out.println("does the array have elements that will add up to sum "+method1(arr,sum));

	}

}
