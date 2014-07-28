package com.problem.array;

public class Problem43 {

	
	public void findNextGreatest(int a[]){
		
		//Scan from right to left
		int n=a.length;
		int nextGreatest[]=new int[n];
		int max=-1;
		
		nextGreatest[n-1]=max;
		for(int i=n-2;i>=0;i--){
			
			if(a[i]< a[i+1]){
				nextGreatest[i]=a[i+1];
				max=a[i+1];
			}
			else
				nextGreatest[i]=max;
		}
		
		//The next Greatest element for the array
		for(int i=0;i<n;i++)
			System.out.println(nextGreatest[i]);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem43 p=new Problem43();
		int arr[]={4,5,7,2,25};
		p.findNextGreatest(arr);
	}

}
