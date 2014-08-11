package com.problem.string;

public class Problem08 {
	
	//An utility function that will calculate a factorial of a number
	private int fact(int n){
		if(n==0)return 1;
		return n * fact(n-1);
	}
	
	//An utility function that will calculate how many charcters are less than given charcter
	private int countNumberRight(String str,int low){
		
		int countRight=0;
		for(int i=low+1;i<str.length();i++){
			if(str.charAt(i) < str.charAt(low))
				countRight++;
		}
		return countRight;
	}
	
	/*
	 * This approach will result in O(n^2) 
	 * A better approach will be to store a count array as in count sort 
	 * This approach will result in a time complexity of O(n)
	 */
	public int rank1(String str){
		
		int rank=1;
		int len=str.length();
		int mul=fact(len);
		for(int i=0;i<len;i++){
			
			//Count the number of combinations after fixing the ith position
			mul/=(len-i);
			
			//Count the number of charcters less than the given character
			int less=countNumberRight(str,i);
			
			rank+=less * mul;
			
		}
		
		return rank;
	}
	
	public void solve(){
		
		String str="STRING";
		System.out.println("The rank of this string is "+rank1(str));
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
