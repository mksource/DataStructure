package com.problem.dp;

public class Problem17 {
	
	
	private int min(int a,int b){
		return (a > b)?a:b;
	}
	
	//Recursive Solution
	/*
	 * Let the input string be str[l...h]. The problem can be broken into three parts
	 * 1. Find the minimum number of insertions in substring str[l+1...h]
	 * 2. Find the minimum number of insertions in substring str[l...h-1] 
	 * 3. Find the minimum number of insertions in substring str[l+1...h-1]
	 */
	public int minIns(String X,int left,int right){
		
		//Base Cases
		/*
		 * If the left index has crossed the right index
		 * if the left index is same as right index we don't need any insertion
		 * if there are two characers 
		 */
		if(left > right) return Integer.MAX_VALUE;
		if(left == right)return 0;
		if(left == right-1) return (X.charAt(left) == X.charAt(right))?0:1;
		
		return (X.charAt(left) == X.charAt(right))?minIns(X,left+1,right-1):min(minIns(X,left+1,right),minIns(X,left,right-1))+1;
	}
	
	public void solve(){
		
		String str="geeks";
		System.out.println("The minimum number of insertions required is "+minIns(str,0,str.length()-1));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem17 p=new Problem17();
		p.solve();
	}

}
