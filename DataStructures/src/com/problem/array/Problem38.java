package com.problem.array;

/*
 * You are given an array of n+2 elements. All the elements of the array are in the range 1 to n. All the elements 
 * expect 2 occur twice. Find the repeating elements
 */

public class Problem38 {
	
	
	public void solve(int a[],int n){
		
		//Contains the xor of all elements and all elements in the range 1 to n
		int xor=a[0];
		
		//Length of the array
		int length=a.length;
		
		//variables hold x and y
		int x=0;
		int y=0;
		
		//To get the rightmost bit set
		int set_bit_no=0;
		
		//Step 1. Xor all the elements 
		for(int i=0;i<length;i++){
			xor=xor^a[i];
		}
		
		//Step 2: XOR all the elements in the range 1 to n
		for(int i=1;i<=n;i++){
			xor=xor^i;
		}
		
		//Now Xor contains X^Y
		set_bit_no=xor & ~(xor-1);
		
		//Set the rightmost bit set
		
		//Now XOR based on the rightmost bit set
		for(int i=0;i<length;i++){
			
			if((a[i] & set_bit_no)==1)
				x=x ^ a[i];
			else
				y=y ^ a[i];
			
		}
		
		for(int i=1;i<n;i++){
			
			if((i & set_bit_no)==1)
				x=x ^ i;
			else
				y=y ^ i;
		}
		
		
		System.out.println("The two repeating elements are "+x+" "+y);
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
