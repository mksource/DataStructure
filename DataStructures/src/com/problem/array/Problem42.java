package com.problem.array;

public class Problem42 {

	
	public boolean findOccurrence(int a[]){
		
		//number of elements in the array
		int n=a.length;
		
		//Step 1 find the minimum element in the array 
		int min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<min)
				min=a[i];
		}
		
		//Step 2 find the maximum element in the array
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		
		//Step 3 find whether max-min+1=n number of distinct elements in the array
		//Step 4 find if there are any duplicates in the array
		boolean isConsecutive=true;
		if(max-min+1 == n){
			
			boolean visited[]=new boolean[n];
			
			for(int i=0;i<n;i++){
				
				if(visited[a[i]-min])
					isConsecutive=false;
				else
					visited[a[i]-min]=true;
			}
			return isConsecutive;
		}
		else
			return false;
		
		
		
		
		
		
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem42 p=new Problem42();
		
		int arr1[]={5,2,3,1,4};
		int arr2[]={83,78,80,81,79,82};
		int arr3[]={34,23,52,12,3};
		int arr4[]={7,6,5,5,3,4};
		
		System.out.println("Is Array1 consecutive "+p.findOccurrence(arr1));
		System.out.println("Is Array2 consecutive "+p.findOccurrence(arr2));
		System.out.println("Is Array3 consecutive "+p.findOccurrence(arr3));
		System.out.println("Is Array4 consecutive "+p.findOccurrence(arr4));
		}

}
