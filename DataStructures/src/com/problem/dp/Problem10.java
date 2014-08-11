package com.problem.dp;

public class Problem10 {

	
	public int solve(int arr[]){
		
		//length of the array
		int n=arr.length;
		int max=0;
		
		//Dynamic programming variation of longest increasing sequence 
		//where instead of the length of the sequence we conside the sum of the sequence
		int msis[]=new int[n];
		
		for(int i=0;i<n;i++)
			msis[i]=arr[i];
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[i] > arr[j] && msis[i] < msis[j]+arr[i])
					msis[i]=msis[j]+arr[i];
			}
		}
		
		//Pick the maximum of all 
		for(int i=0;i<n;i++)
			if(max < msis[i])
				max=msis[i];
		
		return max;
		
		
	}
	
	
	public static void main(String args[]){
			
		Problem10 p=new Problem10();
		int arr[]={1,101,2,3,100,4,5};
		int max=p.solve(arr);
		System.out.println("The subsequence with maximum sum is "+max);
	}

}
