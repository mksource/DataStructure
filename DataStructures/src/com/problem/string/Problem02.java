package com.problem.string;

public class Problem02 {

	private boolean isDiff(char a,char b){
		
		if(a==b)
			return false;
		else
			return true;
	}
	private char getReplaceChar(char a,char b){
		
		if((a == 'a' && b=='b')||(a=='b' && b=='a'))
			return 'c';
		else if((a == 'a' && b=='c')||(a=='c' && b=='a'))
			return 'b';
		else
			return 'a';
	}
	
	public void replaceString(String str){
		
		StringBuffer bfr=new StringBuffer(str);
		
		for(int i=0;i<=bfr.length()-2;i++){
			
			if(isDiff(bfr.charAt(i),bfr.charAt(i+1))){
				System.out.println(bfr.deleteCharAt(i));
				System.out.println(bfr.deleteCharAt(i+1));
				int r=getReplaceChar(bfr.charAt(i),bfr.charAt(i+1));
				bfr.insert(i,r);
			}
				
		}
		
		System.out.println(bfr.toString());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem02 p=new Problem02();
		p.replaceString("bcab");

	}

}
