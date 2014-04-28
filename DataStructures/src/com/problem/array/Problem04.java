package com.problem.array;

public class Problem04 {

	
	
	private int findPivot(int arr[],int low,int high){
		
		//If the array is already sorted then return -1
		if(high<low)
			return -1;
		
		//eg 2 3 4 5 6 7 8 1 in this case high==low
		if(high==low)
			return low;
		
		int mid=low+(high-low)/2;
		
		if(mid < high && arr[mid]>arr[mid+1])
			return mid;
		if(mid > low && arr[mid]<arr[mid-1])
			return mid-1;
		if(arr[low]>=arr[mid])
			return findPivot(arr,low,mid-1);
		else
			return findPivot(arr,mid+1,high);
		
		
	}
	private int pivotedBinarySearch(int arr[],int key){
		
		int pivot=findPivot(arr,0,arr.length-1);
		
		if(pivot==-1)
			binarySearch(arr,0,arr.length-1,key);
		
		if(key==arr[pivot])
			return pivot;
		if(arr[0]<=key)
			return binarySearch(arr,0,pivot-1,key);
		else
			return binarySearch(arr,pivot+1,arr.length-1,key);
		
	
	}
	private int binarySearch(int arr[],int low,int high,int key){
		
		if(high < low)
			return -1;
		
		int mid=low+(high-low)/2;
		
		if(arr[mid]==key)
			return mid;
		if(key<arr[mid])
			return binarySearch(arr,low,mid-1,key);
		else
			return binarySearch(arr,mid+1,high,key);
		
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem04 p=new Problem04();
		int arr[]={5,6,7,8,1,2,3,4};
		p.pivotedBinarySearch(arr,20);
	}

}
