package com.problem.dp;
/*
 * Longest Palindrome subsequence in the string
 */

public class Problem01 {

	
	private int max(int a,int b){
		return (a>b)?a:b;
	}
	
	
	public int lps(String str,int i,int j){
		
		//Base Case 1: If there is only one character
		if(i == j)
			return 1;
		
		//Base Case 2: If there are two characters and both are same
		if(str.charAt(i)==str.charAt(i) && i+1==j)
			return 2;
		
		//If the first and last character match
		if(str.charAt(i)==str.charAt(j))
			return lps(str,i+1,j-1)+2;
		
		//If the first character and last character do not match
		return max(lps(str,i+1,j),lps(str,i,j-1));
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="BBABCBCAB";
		String str2="GEEKSFORGEEKS";
		Problem01 p=new Problem01();
		System.out.println("The longest palindrom sequence is "+p.lps(str1,0,str1.length()-1));
		System.out.println("The longest palindrome sequence is "+p.lps(str2,0,str2.length()-1));

	}

}
