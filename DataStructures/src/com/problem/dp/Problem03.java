package com.problem.dp;

public class Problem03 {

	
	public int lis(int arr[]){
		
		int lis[]=new int[arr.length];
		int n=arr.length;
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j] && lis[i]<lis[j]+1)
					lis[i]=lis[j]+1;
			}
		}
		
		return lis[n-1];
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem03 p=new Problem03();
		int arr[]={10,22,9,33,21,50,41,60,80};
		System.out.println("The longest increasing sequence is "+p.lis(arr));
	}

}
