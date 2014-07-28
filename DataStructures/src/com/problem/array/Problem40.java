package com.problem.array;
/*
 * Given an array of n elements which contains elements from 0 to n-1 with any of these numbers appearing any number
 * of times. Find the repeating elements in O(n) time and using only constant space
 */
import java.math.*;

public class Problem40 {
	
	
	public void solve(int a[]){
		
		for(int i=0;i<a.length;i++){
			
			//If the element is positive then make it negative
			if(a[Math.abs(a[i])]>=0)
				a[Math.abs(a[i])]=-a[Math.abs(a[i])];
			else
				System.out.print(Math.abs(a[i])+" ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem40 p=new Problem40();
		int arr[]={1,2,3,1,3,6,6};
		p.solve(arr);
		
	}

}
