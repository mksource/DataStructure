package com.problem.dp;

public class Problem08 {

	
	private int min(int a,int b){
		
		return (a<b)?a:b;
	}
	private int min(int a,int b,int c){
		return min(min(a,b),c);
	}
		
	private int minCost(int cost[][],int m,int n){
		
		
		int tc[][]=new int[m+1][n+1];
		
		tc[0][0]=cost[0][0];
		//initialize row wise
		for(int i=1;i<=n;i++)
			tc[0][i]=tc[0][i-1]+cost[0][i-1];
		
		
		//initialize column wise
		for(int j=1;j<=m;j++)	
			tc[j][0]=tc[j-1][0]+cost[j-1][0];
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				
				tc[i][j]=min(tc[i-1][j-1],tc[i-1][j],tc[i][j-1])+cost[i][j];
			}
		}
			
		return tc[m][n];	
	}
	
	
	
	
	public void solve(){
		
		int cost[][]={ {1,2,3},
				        {4,5,6},
				        {7,8,9}
		};
		
		minCost(cost,3,3);
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem08 p=new Problem08();
		p.solve();
		
	}

}
