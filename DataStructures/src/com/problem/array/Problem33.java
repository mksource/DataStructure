package com.problem.array;

public class Problem33 {

	
	public int maxSum(int arr[]){
		
		
		int exclusive=0;
		int inclusive=arr[0];
		int exclusive_new=0;
		
		for(int i=1;i<arr.length;i++){
				
			
			exclusive_new=max(exclusive,inclusive);
			inclusive=exclusive+inclusive;
			exclusive=exclusive_new;
		}
		
		return (inclusive>exclusive)?inclusive:exclusive;
	}
	
	private int max(int a,int b){
		
		return (a>b)?a:b;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={3,2,5,10,7};
		Problem33 p=new Problem33();
		System.out.print("The maximum sum is "+p.maxSum(arr));
	}

}
