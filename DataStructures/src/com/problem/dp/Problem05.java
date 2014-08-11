package com.problem.dp;

public class Problem05 {

		
	//Recursive solution 
	public int solve(char digits[],int n){
		
		//base cases
		if(n == 0 || n==1)
			return 1;
		
		int count=0;
		
		//If the last digit is not zero 
		if(digits[n-1] > '0')
			solve(digits,n-1);
		
		//consider two digits at a time and if the two digits is less than 27
		if(digits[n-2] < '2' || (digits[n-2] == '2' && digits[n-1] < '7'))
			count+=solve(digits,n-2);
		
		return count;
			
	}
	
	
	//Memorization
	public int solve2(char digits[],int n){
		
		int count[]=new int[n+1];
		
		//bases cases 
		count[0]=1;
		count[1]=1;
		
		for(int i=2;i<=n;i++){
			
			count[i]=0;
			
			if(digits[i-1] > '0')
				count[i]=count[i-1];
			
			if(digits[i-2] < '2' || (digits[i-2] == '2' && digits[i-1] < '7'))
				count[i]+=count[i-2];
		}
		
		return count[n];
	}
		
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem05 p=new Problem05();
		char digits[]={'1','2','1'};
		int count=p.solve2(digits,digits.length);
		System.out.println("The number of possible digits are "+count);
		
	}

}
