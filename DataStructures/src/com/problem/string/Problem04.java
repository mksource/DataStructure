package com.problem.string;
/*
 * Write a Program to print the permutation of the String
 */

public class Problem04 {
	
	
	
	public static void doPermute(String str,int length,boolean used[],StringBuffer buffer){
		
		if(length == str.length()){
			System.out.print(buffer.toString()+" ");
			return;
		}
		else{
			for(int i=0;i<str.length();i++){
				if(used[i])continue;
				buffer.append(str.charAt(i));
				used[i]=true;
				doPermute(str,length+1,used,buffer);
				used[i]=false;
				buffer.setLength(buffer.length()-1);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ABC";
		boolean[] used=new boolean[str.length()];
		StringBuffer buf=new StringBuffer();
		doPermute(str,0,used,buf);
	}

}
