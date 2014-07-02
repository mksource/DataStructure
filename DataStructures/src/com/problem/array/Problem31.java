package com.problem.array;

/*
 * Find the subarry whose sum is equal to a given element
 */

public class Problem31 {

	
	
	//Consider all the elements that start with i
	//O(n^2) approach
	public void solve1(int arr[],int sum){
		
		int n=arr.length;
		int curr_sum=0;
		for(int i=0;i<n;i++){
			
			curr_sum=arr[i];
			
			for(int j=i+1;j<n;j++){
				
				if(curr_sum == sum){
					System.out.print("The sum is found between "+i+" and "+(j-1));
					return;
				}
				if(curr_sum > sum || j==n)
					break;
				curr_sum=curr_sum+arr[j];
			}
			
		}
		
		
	}
	public void solve2(int arr[],int sum){
		
		/*
		 *  Initialize a variable curr_sum with the first element
		 *  consider the second element and add all the elements to curr_sum
		 *  until we find that curr_sum is greater than sum and remove the starting elements 
		 *  until curr_sum is greater than sum
		 */
		
		int n=arr.length;
		int curr_sum=arr[0];
		int start=0;
		for(int i=1;i<n;i++){
			
			while(curr_sum>sum && start<i){
				curr_sum=curr_sum-arr[start];
				start++;
			}
			
			if(curr_sum == sum)
				System.out.print("The sum is found between "+start+" and "+(i-1));
			
			curr_sum+=arr[i];
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={15,2,4,8,9,5,10,23};
		int sum=23;
		Problem31 p=new Problem31();
		p.solve2(arr, sum);

	}

}
