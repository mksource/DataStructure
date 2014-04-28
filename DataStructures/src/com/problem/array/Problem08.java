package com.problem.array;

public class Problem08 {

	
	private static int getMissingNumber(int arr[],int n){
		
		int total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
			total-=arr[i];
		return total;
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,2,4,6,3,7,8};
		System.out.println("The missing number from array is "+getMissingNumber(arr,arr.length));
	}

}
