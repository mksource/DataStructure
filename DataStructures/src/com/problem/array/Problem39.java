package com.problem.array;

public class Problem39 {

	
	public void solve(int a[]){
		
		
		int n=a.length;
		
		//Holds the starting position of the subarray
		int start=0;
		
		
		//Holds the ending position of the subarray
		int end=0;
		
		/*
		 * Step 1: Scan from left to right and find the first point where left index is greater than right index
		 */
		int s=0;
		for(int i=0;i<n-1;i++){
			if(a[i]>a[i+1]){
				s=i;
				break;
			}	
		}
		
		if(s==n-1){
			System.out.println("The complete array is sorted");
			return;
		}
		
		/*
		 * Step 2: Scan from right to left and find the first point where right index is less than left index
		 */
		int e=0;
		for(int i=n-1;i>=0;i--){
			if(a[i] < a[i-1]){
				e=i;
				break;
			}
				
		}
		
		//Find the minimum element and the maximum element in the range s and e
		int min=a[s];
		int max=a[s];
		for(int i=s;i<=e;i++){
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		
		
		//Then in  the range from arr[0..s] if we find an element greater than min than include in subarray
		start=s;
		for(int i=0;i<s;i++){
			if(a[i]>min){
				start=i;
				break;
			}	
		}
		
		
		//Then in the range from arr[e...n-1] if we find an element less than max include in the subarray
		for(int i=e+1;i<n;i++){
			if(a[i]<max){
				end=i;
				break;
			}	
		}
		
		
		System.out.println("The ending and starting position of the subarray are "+start+"to"+end);
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem39 p=new Problem39();
		int arr1[]={10,12,20,30,25,40,32,31,35,50,60};
		int arr2[]={0,1,15,25,6,7,30,40,50};
		p.solve(arr1);

	}
	
	

}
