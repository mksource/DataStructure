package com.problem.dp;

public class Problem07 {

	
	private int min(int a,int b){
		
		return (a < b)?a:b;
	}
	
	private int editDistanceDP(String str1,String str2){ 
		
		//Length of the first string 
		int m=str1.length();
		
		//Length of the second stringt
		int n=str2.length();
		
		//Edit Cost
		int EDIT_COST=1;
		
		//matrix to hold the edit distance for string1 with length i and string2 with length 2
		int T[][]=new int[m+1][n+1];
		
		//initialize the matrix with initial values
		//if one string length is 0 and other string m then edit cost will be m
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				T[i][j]=-1;
			}
		}
		
		for(int i=0;i<m;i++){
			T[i][0]=i;
		}
		
		for(int j=0;j<n;j++){
			T[0][j]=j;
		}
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				
				
				//leftcell Deletion
				int leftCell=T[i][j-1]+EDIT_COST;
				
				
				//rightCell insertion
				int rightCell=T[i-1][j]+EDIT_COST;
				
				
				//cornerCell Replace
				int cornerCell=T[i-1][j-1];
				if(str1.charAt(i-1) != str2.charAt(j-1))
					cornerCell+=1;
				
				T[i][j]=min(min(leftCell,rightCell),cornerCell);
				
				
			}
		}
		
		return T[m][n];
			
	}
	
	public void solve(){
		
		String str1="SATURDAY";
		String str2="SUNDAY";
		System.out.println("The edit distance is "+editDistanceDP(str1, str2));
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem07 p=new Problem07();
		p.solve();
	}

}
