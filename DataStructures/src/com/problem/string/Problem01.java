package com.problem.string;

public class Problem01 {
	
	public static String replaceString(String input){
		
		StringBuffer buffer=new StringBuffer(input);
		int count=1;
		
		for(int i=0;i<buffer.length();i++){
			
			if(i<buffer.length()-1 && buffer.charAt(i)==buffer.charAt(i+1)){
				
				buffer.deleteCharAt(i);
				i--;
				count++;
			}
			else{
				buffer.insert(i+1,count);
				count=1;
				i++;
			}
		}
		
		return buffer.toString();
	}
	
	public static void main(String args[]){
		
		String input="aaabbccdeeabb";
		
		System.out.println("Replaced String "+replaceString(input));
	}

}
