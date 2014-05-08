package com.problem.dp;

public class Problem04 {

	private int max(int a,int b){
		return (a>b)?a:b;
	}
	
	//optimal substructure solution
	public int lcs(String str1,String str2,int m,int n){
		
		if(m==0 || n==0)
			return 0;
		if(str1.charAt(m-1)==str2.charAt(n-1))
			return 1+lcs(str1,str2,m-1,n-1);
		else
			return max(lcs(str1,str2,m-1,n),lcs(str1,str2,m,n-1));
	}
	
	
	//Memorization
	public int lcsMem(String str1,String str2,int m,int n){
		
		int lcs[][]=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				
				if(i==0 || j==0)
					lcs[i][j]=0;
				else if(str1.charAt(i-1)==str2.charAt(j-1))
					lcs[i][j]=1+lcs[i-1][j-1];
				else
					lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);
			}
		}
		return lcs[m][n];
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem04 p=new Problem04();
		String str1="ABCDGH";
		String str2="AEDFHR";
		String str3="AGGTAB";
		String str4="GXTXAYB";
		
		System.out.println("The longest common subsequence is "+p.lcs(str1,str2,str1.length(),str2.length()));
		
		System.out.println("The longest common subsequence is "+p.lcsMem(str3, str4, str3.length(),str4.length()));
		
	}

}
