package com.problem.string;
/*
 * Print all the combinations of the string
 */

public class Problem05 {

	/**
	 * @param args
	 */
	StringBuffer output=new StringBuffer();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem05 p=new Problem05();
		String str="wxyz";
		p.combine(str,0);

	}
	public void combine(String str,int start){
		
		
		
		for(int i=start;i < str.length();i++){
			output.append(str.charAt(i));
			System.out.println(output);
			if(i < str.length())
				combine(str,i+1);
			output.setLength(output.length()-1);
		}
	}

}
