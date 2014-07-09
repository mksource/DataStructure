package com.problem.array;

/*
 * An element is called a leader if it is greater than all the elements to its rightside
 * and rightmost element is always the leader
 */

public class Problem32 {

	
	//Scan the array from the right hand side of the array
	public void findLeader(int arr[]){
		
		int n=arr.length;
		int max_so_far=arr[n-1];
		System.out.print(max_so_far+" ");
		for(int i=arr.length-2;i>=0;i--){
			
			if(arr[i] > max_so_far){
				max_so_far=arr[i];
				System.out.print(max_so_far+" ");
			}	
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem32 p=new Problem32();
		int arr[]={16,17,4,3,5,2};
		p.findLeader(arr);
	}

}
