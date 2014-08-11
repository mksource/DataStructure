package com.problem.dp;

public class Problem11 {

	
	private int max(int a,int b){
		return (a > b)?a:b;
	}
	
	//Recursive Method
	public int cutRod(int price[],int n){
		
		if(n<=0)
			return 0;
		int max_value=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			max_value=max(max_value,price[i]+cutRod(price,n-i-1));
		}
		return max_value;
	}
	
	
	//Memorization Technique
	public int cutRod2(int price[],int n){
		
		int value[]=new int[n+1];
		value[0]=0;
		
		for(int i=1;i<=n;i++){
			
			int max_val=Integer.MIN_VALUE;
			for(int j=0;j<i;j++){
				max_val=max(max_val,price[j]+value[i-j-1]);
			}
			value[i]=max_val;
		}
		
		return value[n];
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem11 p=new Problem11();
		int arr[]={1,5,8,9,10,17,17,20};
		System.out.println("The maximum possible cuts are "+p.cutRod(arr,arr.length));
		
	}

}
