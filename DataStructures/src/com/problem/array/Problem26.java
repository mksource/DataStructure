package com.problem.array;

/*
 * Move all zero's to end of the array
 */


public class Problem26 {

	
	public static void moveToEnd(int arr[]){
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}
			
		while(count<arr.length)
			arr[count++]=0;
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		
		int arr[]={1,9,8,4,0,0,2,7,0,6,0};
		moveToEnd(arr);
		
	}
}
