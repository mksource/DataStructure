package com.problem.array;
/*
 * Majority Element in a array is an element which occurs more than n/2 times
 * may not be continuously
 */

public class Problem05 {

	
	//Moore's Voting algorithm
	/*
	 * The basic idea behind the moore's voting algorithm 
	 * is if we cancel out each occurrence of an element e with all 
	 * the other elements that are different from e then e will still exists 
	 * if it is a majority element
	 */
	private int findMajority(int arr[]){
		
		int  maj_index=0;
		int count=1;
		int n=arr.length;
		for(int i=1;i<n;i++){
			
			if(arr[maj_index]==arr[i])
				count++;
			else
				count--;
			if(count==0){
				count=1;
				maj_index=i;
			}
		}
		
		return arr[maj_index];
	}
	
	private boolean isMajority(int arr[],int cand){
		
		int count=0;
		int size=arr.length;
		for(int i=0;i<size;i++)
			if(arr[i]==cand)
				count++;
		if(count > size/2)
			return true;
		else
			return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem05 p=new Problem05();
		int arr1[]={3,3,4,2,4,4,2,4,4};
		int arr2[]={3,3,4,2,4,4,2,4};
		int maj_index=p.findMajority(arr1);
		System.out.println("Is Majority Candidate for first array "+p.isMajority(arr1,maj_index));
		maj_index=p.findMajority(arr2);
		System.out.println("Is Majority Candidate for Second array "+p.isMajority(arr2,maj_index));
	}

}
