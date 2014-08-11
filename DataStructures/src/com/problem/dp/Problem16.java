package com.problem.dp;

public class Problem16 {

	
	private int max(int a,int b){
		
		return (a>b)?a:b;
	}
	
	
	/*
	 * Create a table that will contain the length of Longest common suffix.
	 * of the 
	 */
	public int solve(String str1,String str2){
		
		//length of the first string
		int m=str1.length();
		
		//length of the second string
		int n=str2.length();
		
		//Holds the Longest common substring
		int LCS[][]=new int[m+1][n+1];
		
		int result=0;
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				
				if(i == 0 || j==0)
					LCS[i][j]=0;
				else if(str1.charAt(i-1) == str2.charAt(j-1)){
					LCS[i][j]=1+LCS[i-1][j-1];
					result=max(result,LCS[i][j]);
				}
				else
					LCS[i][j]=0;
					
			}
		}
		
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem16 p=new Problem16();
		String str1="OldSite:GeeksforGeeks.org";
		String str2="NewSite:GeeksQuiz.com";
		System.out.println("The length of the longest common substring "+p.solve(str1, str2));

	}

}
