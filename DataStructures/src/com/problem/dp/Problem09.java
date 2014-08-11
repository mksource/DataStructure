package com.problem.dp;

/*
 * A sequence is called Bitonic if it is first increasing and then decreasing
 * 
 * A sorted sequence in increasing order is bitonic with decreasing part empty 
 * A sorted sequence in decreading order is bitonic with increasing part empty
 */

public class Problem09 {
	
	
	public int solve(int arr[]){
		
		//length of the array
		int n=arr.length;
		
		int lis[]=new int[n];
		int lds[]=new int[n];
		
		//Step 1: Find the longest increasing sequence
		for(int i=0;i<n;i++)
			lis[i]=1;
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[i] > arr[j] && lis[i] < lis[j]+1)
					lis[i]=lis[j]+1;
			}
				
		}
					
		//Step 2: Find the longest decreasing sequence
		for(int i=0;i<n;i++)
			lds[i]=1;
		
		for(int i=n-2;i>=0;i--){
			for(int j=n-1;j>i;j--)
				if(arr[i] > arr[j] && lds[i] < lds[j]+1)
					lds[i]=lds[j]+1;
		}
		
		
		//Step 3 Return the maximum of lis[i]+lds[i]-1
		int max=lis[0]+lds[0]-1;
		for(int i=1;i<n;i++)
			if(lis[i]+lds[i]-1 > max)
				max=lis[i]+lds[i]-1;
		return max;	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem09 p=new Problem09();
		int arr[]={0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
		int count=p.solve(arr);
		System.out.println("The largest bitonic array is "+count);

	}

}
