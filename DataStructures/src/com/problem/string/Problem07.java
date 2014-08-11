package com.problem.string;

public class Problem07 {

	
	public void solve(){
		
		/*
		 *  *  matches 0 or more character 
		 *  ?  matches exactly 1 character
		 */
		
		System.out.println(match("g*ks","geeks",0,0));
		System.out.println(match("g*k","gee",0,0));
		System.out.println(match("pqrs","pqrst",0,0));
		
	}
	
	public boolean match(String str1,String str2,int i,int j){
		
		//If one of the strings has exceeded its length
		if( i > str1.length()-1 || j > str2.length()-1)
			return false;
		
		//Base case if the pointers at both the strings have reached the end points
		if( i == str1.length()-1 && j == str2.length()-1)
			return true;
		
		/*
		 * if the current character is * in the pattern and is there any more strings in the pattern
		 * but is there no more strings in the original string then return false
		 */
		if( str1.charAt(i) == '*' && (i < str1.length()-1 && j == str2.length()-1))
			return false;
		
		//if the current character is ? or the charcter under pattern and string increement the pointers
		if(str1.charAt(i) == '?' || str1.charAt(i) == str2.charAt(j))
			return match(str1,str2,i+1,j+1);
		
		//if the current character is  * then we have two cases
		//it matches 0 charcters 
		//it matche the current charcter
		if(str1.charAt(i) == '*')
			return match(str1,str2,i,j+1) || match(str1,str2,i+1,j);
			
		
		//All other cases return false
		return false;	
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
