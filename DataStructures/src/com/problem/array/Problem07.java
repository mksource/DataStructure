package com.problem.array;

public class Problem07 {

	
	public static int largestContigousSum(int arr[]){
		
		int max_ending_here = 0;
		int max_so_far=0;
		
		for(int i=1;i<arr.length;i++){
			
			max_ending_here=max_ending_here+arr[i];
			if(max_ending_here<0)
				max_ending_here=0;
			if(max_so_far<max_ending_here)
				max_so_far=max_ending_here;
		}
		return max_so_far;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		System.out.println("The largest contingous sum "+largestContigousSum(arr));
	}

}
