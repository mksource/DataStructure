package com.problem.array;

public class Problem10 {

	
	/*
	 * Method01 using temp array
	 */
	private static void rotateArray1(int arr[],int d){
		
		int temp[]=new int[d];
		int size=arr.length;
		
		for(int i=0;i<d;i++)
			temp[i]=arr[i];
		
		for(int i=d;i<size;i++)
			arr[i-d]=arr[i];
		
		for(int i=0;i<d;i++){
			arr[size-d+i]=temp[i];
		}
		
		System.out.println("After rotation using method1");
		for(int i:arr)System.out.print(i+" ");
	}
	
	/*
	 * Rotating Left by one
	 */
	private static void rotateArray2(int arr[],int d){
		
		int n=arr.length-1;
		for(int i=0;i<d;i++){
			int temp=arr[0];
			int j=0;
			for(j=0;j<n-1;j++)
				arr[j]=arr[j+1];
			arr[j]=temp;
		}
		
		System.out.println("After rotation using method2");
		for(int i:arr)System.out.print(i+" ");
		
	}
	
	/*
	 * A juggling algorithm based on gcd of n and d
	 */
	private static void rotateArray3(int arr[],int d){
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,2,3,4,5,6,7};
		//rotateArray1(arr,2);
		//rotateArray2(arr, 2);
	}

}
