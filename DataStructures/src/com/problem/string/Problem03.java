package com.problem.string;

public class Problem03 {
	
	
	public void solve(String s){
		
		int length=s.length();
		int countArray[]=new int[256];
		
		for(int i=0;i<length;i++){
			
			char ch=s.charAt(i);
			countArray[ch]=countArray[ch]+1;
		}
		
		//Print out the first nonRepeating Character
		//We can improve this approach by storing the device ocurrence count and index of the element in the count array 
		//and then scanning the count array
		for(int i=0;i<length;i++){
			
			char ch=s.charAt(i);
			if(countArray[ch] == 1){
				System.out.println("The first non-repeating character is "+ch);
				break;
			}
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="geeksforgeeks";
		Problem03 p=new Problem03();
		p.solve(s);
	}

}
