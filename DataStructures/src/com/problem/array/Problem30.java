package com.problem.array;


/*
 * Smallest subarray with sum greater than a given value
 */
public class Problem30 {

	
	
	public int solve(int arr[],int sum){
		
		int curr_sum=0;
		int start=0;
		int end=0;
		int n=arr.length-1;
		int min_len=n;
		
		while(end < n){
			
			//Add the elements util it is smaller
			while(curr_sum<=sum && end<n)
				curr_sum+=arr[end++];
			
			while(curr_sum>sum && start<n){
				
				if((end-start)<min_len)
					min_len=end-start;
				
				curr_sum-=arr[start++];
			}
		}
	
		return min_len;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Problem30 p=new Problem30();
		int arr[]={1,4,45,6,0,19};
		int sum=51;
		int len=p.solve(arr,sum);
		System.out.print("The minimum length is "+len);

	}

}
