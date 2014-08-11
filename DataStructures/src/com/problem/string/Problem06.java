package com.problem.string;

/*
 * The O(n) approach to this problem would be
 * to concatenate the string to the string itself and form a string of length 2n
 * Then we have to find the length of the longest palindrome string if it is n
 * then the given string is a rotation of a paliindrome string
 */

public class Problem06 {
	
	
	public void solve(String str){
		
		//length of the string
		int n=str.length();
		
		//Concatenate the two strings
		String palindrome=str+str;
		
		int lps=lps(palindrome,0,2*n-1);
		
	
		if(lps==n){
			System.out.println("The Given string is rotated palindrome string");
		}
	}
	
	private int lps(String str,int i,int j){
		
		//Base case if only 1 character is there
		if(i == j)
			return 1;
		
		//Base case if there are 2 characters
		if(str.charAt(i) == str.charAt(j) && i+1 == j)
			return 2;
		
		//the character at position i and j are same
		if(str.charAt(i) == str.charAt(j))
			return lps(str,i+1,j-1)+2;
		
		//the characters at position i and j are not same
		return max(lps(str,i+1,j),lps(str,i,j-1));
		
	}
	
	private int max(int a,int b){
		return (a > b)?a:b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem06 p=new Problem06();
		p.solve("aab");
	}

}
