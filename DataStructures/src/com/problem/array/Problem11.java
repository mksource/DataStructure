package com.problem.array;

/*
 * Initialise   A=arr[0...d-1] and B=arr[d...n-1]
 * 1.)Do the following until the size of A and B are equal
 * 
 *    i)If the B is longer than divide B into BlBr where size of Br is equal to A,Now Swap Br and A
 *      Now A is in its final place. Now recur on B
 *      
 *    ii)If A is longer than divide A into AlArB where length of Al is equal to B, swap Al and B to get 
 *       final place of B. Finally recur on A
 *         
 * 
 * Finally when A and B are of equal size block swap 
 */

public class Problem11 {

	
	private static void blockswap(int arr[],int d){
		
		int n=arr.length;
		
		//No need to swap the integers
		if(d==0 || d==n)
			return;
		
		int i=d;
		int j=n-d;
		while(i!=j){
			
			//If A is shorter
			if(i<j){
				swap(arr,d-i,d+j-i,i);
				j-=i;
			}
			//If B is shorter
			else{
				swap(arr,d-i,d,j);
				i-=j;
			}
			
		}
				
		swap(arr,d-i,d,i);	
	}
	private static void swap(int arr[],int fi,int si,int d){
		
		for(int i=0;i<d;i++){
			int temp=arr[fi+i];
			arr[fi+i]=arr[si+i];
			arr[si+i]=temp;
		}
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,3,4,5,6,7,8,9};
		int d=3;
		blockswap(arr,d);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
