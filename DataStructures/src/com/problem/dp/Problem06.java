package com.problem.dp;

public class Problem06 {

	
	//Recursive solution
	public int solve(int N){
		
		//base case 
		if(N < 0)
			return 0;
		if(N == 1)
			return 1;
		
		//If the N digit is 1 then N-1 cannot be 1
		//If the N digit is not 1 then N-1 can be 1
		return 1+solve(N-1)+solve(N-2);
		
	}
	
	//Memorization Technique
	public int solve2(int N){
		
		//Let a[i] be an array with ith element ending in zero
		//Let b[i] be an array with ith element ending in one
		int a[]=new int[N];
		int b[]=new int[N];
		
		a[0]=1;
		b[0]=1;
		for(int i=1;i<N;i++){
			
			a[i]=a[i-1]+b[i-1];
			b[i]=a[i-1];
		}
		
		return a[N-1]+b[N-1];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem06 p=new Problem06();
		int N=1;
		System.out.println("The number of possible binary digits without consecutive 1's"+p.solve(N));

	}

}
