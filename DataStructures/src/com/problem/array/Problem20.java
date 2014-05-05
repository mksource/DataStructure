package com.problem.array;
/*
 * Finding the median in a stream of running integers
 */

public class Problem20 {

	
	public int findMinDistance(int arr[],int x,int y){
		
		int prev=0;
		int i=0;
		int min_dist=Integer.MAX_VALUE;
		
		for(i=0;i<arr.length;i++){
			
			if(arr[i] == x || arr[i]==y){
				prev=i;
				break;
			}	
			
		}
		
		for(;i<arr.length;i++){
			
			if(arr[i]==x || arr[i]==y){
				
				if(arr[i]!=arr[prev] && (i-prev)<min_dist){
					
					min_dist=i-prev;
					prev=i;
				}else{
					prev=i;
				}
					
			}
		}
		
		return min_dist;
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem20 p=new Problem20();
		int arr[]={3,5,4,2,6,5,6,6,5,4,8,3};
		System.out.println("The minimmum distance is "+p.findMinDistance(arr, 3, 6));
	}

}
