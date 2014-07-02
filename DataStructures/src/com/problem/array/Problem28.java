package com.problem.array;

/*
 * This problem can be solved using dynamic programming
 * 
 * Let a[i] be the number of binary strings of length i which will end in zero
 * Let b[i] be the number of binary strings of length i which will end in one
 * 
 * We can append at the end either 0 or 1 to a string which end's at 0
 * But we can append only 0 to a string which end's at 1
 * 
 * Therefore we can construct a recurrance relation like
 * a[i]=a[i-1]+b[i-1]
 * b[i]=a[i-1]
 * 
 * base case is a[1]=1 and b[1]=1
 * 
 * For a string of length i the total number string's without consecutive 1's are 
 * a[i]+b[i]
 */

public class Problem28 {

	
	private int solve(int length){
		
		int a[]=new int[length];
		int b[]=new int[length];
		
		//Base Case
		a[0]=1;
		b[0]=1;
		
		for(int i=1;i<length;i++){
			a[i]=a[i-1]+b[i-1];
			b[i]=a[i-1];
		}
		
		return a[length-1]+b[length-1];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem28 p=new Problem28();
		int length=4;
		
		System.out.println("The number of strings which does not have consecutive zero's with length "+length+" is"+p.solve(length));
	}

}
