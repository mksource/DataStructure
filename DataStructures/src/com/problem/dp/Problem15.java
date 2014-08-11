package com.problem.dp;

public class Problem15 {
	
	
	private int NO_OF_CHARS=256;
	
	
	public int solve(String input){
		
		//Visited array will tell whether this character has already occurred and stores the previous index
		int visited[]=new int[NO_OF_CHARS];
		
		//initialise the visited array
		for(int i=0;i<NO_OF_CHARS;i++){
			visited[i]=-1;
		}
		
		//current length of the maximum length substring with no repeating characters
		int cur_len=0;
		
		//maximum length
		int max_len=0;
		
		for(int i=0;i<input.length();i++){
			
			char ch=input.charAt(i);
			int previndex=visited[(int)ch];
			
			/*
			 * Check if prevIndex is -1 or if it not part of the Longest Non Repeating sequence
			 */
			if(previndex == -1 || i-cur_len > previndex)
				cur_len++;
			
			
			/*
			 * Here character is part of the Non Repeating Sequence then we have to check for 
			 * the maximum length and also update the previous index
			 */
			else{
				if(cur_len > max_len)
					max_len=cur_len;
				cur_len=i-previndex;
			}
			
			visited[(int)ch]=i;
		}
		
		return max_len;
	}
	
	
	public static void main(String args[]){
		
		Problem15 p=new Problem15();
		String input="GEEKSFORGEEKS";
		p.solve(input);
	}

}
