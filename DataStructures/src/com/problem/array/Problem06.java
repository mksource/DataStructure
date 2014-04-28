package com.problem.array;

public class Problem06 {

	
	private static int getOddOccurrences(int arr[]){
		
		int res=0;
		for(int i=0;i<arr.length;i++){
			res=res ^ arr[i];
		}
		return res;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,3,2,3,1,3};
		System.out.println("The element that occurs odd number of times is "+getOddOccurrences(arr));	

	}

}
