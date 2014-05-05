package com.problem.array;

public class Problem25 {
	
	//Sort the array with 0's, 1's and 2's
	
	//a[1...low-1] Zeros
	//a[low...Mid] ones
	//a[Mid...Hi]  unknown
	//a[Hi+1...N] twows
	
	
	public void sort012(int arr[]){
		
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high){
			
			switch(arr[mid]){
			   
			case  0:
				swap(arr,low,mid);
				low++;
				mid++;
				break;
				
			case 1:
				mid++;
				break;
				
			case 2:
				swap(arr,high,mid);
				mid++;
				high--;
			}
		}
		
		
	}
	private void swap(int arr[],int i,int j){
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String args[]){
		
	}

}
