package com.problem.array;
/*
 * The simple solution would be taking difference between the picked element and every element.
 * Instead of that approach pick the minimum element as you scan the array 
 * if the difference between the picked element and max_diff is greater then update max_diff
 * 
 * If the elements are equal then it will return zero
 * If the elements are arranged in decreasing order then it will return negative value
 */
public class Problem12 {

	
	private static int max_diff(int arr[]){
		
		int max_diff=arr[1]-arr[0];
		int min_element=arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]-min_element>max_diff)
				max_diff=arr[i]-min_element;
			if(arr[i]<min_element)
				min_element=arr[i];
		}
		return max_diff;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={2,3,10,6,4,8,1};
		System.out.println("The maximum difference between two elements is"+max_diff(arr));

	}

}
