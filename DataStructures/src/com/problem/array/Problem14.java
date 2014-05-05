package com.problem.array;

/*
 * separate an array containing 0's and 1's
 */
public class Problem14 {

	
	private static void segaragate(int arr[]){
		
		int leftptr=0;
		int rightptr=arr.length-1;
		
		while(leftptr<rightptr){
			
			//Move the left pointer until you find 1
			while(arr[leftptr]==0 && leftptr<rightptr)
				leftptr++;
			
			//Move the right pointer until you find 0
			while(arr[rightptr]==1 && leftptr<rightptr)
				rightptr--;
			
			if(leftptr<rightptr){
				arr[leftptr++]=0;
				arr[rightptr--]=1;
			}	
		}
		
		System.out.println("After separating 0's and 1's");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[]={0,1,0,1,0,0,1,1,1,0};
		segaragate(input);
	}

}
