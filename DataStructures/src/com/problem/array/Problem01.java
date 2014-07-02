package com.problem.array;

import com.ds.array.QuickSort;
import java.util.HashMap;

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
	
	
	//Using a HashMap
	private static boolean method2(int arr[],int sum){
		
		HashMap<Integer,Integer> binmap=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			
			int key=sum-arr[i];
			if(binmap.containsKey(key)){
				return true;
			}
			binmap.put(arr[i],0);
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
		System.out.println("does the array have elements that will add up to sum "+method2(arr,sum));

	}

}
