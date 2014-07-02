package com.problem.array;

/*
 * Given a sorted array arr[] and a Value X find the k closest element to X
 * If the element is present in the array then it should not be in the output
 */

public class Problem27 {

	
	/*Find the Crossover point*/
	/**
	 * Crossover point is a point before which the elements are smaller than or equal to x
	 * and after which the elements are greater than x
	 */
	private int findCrossOver(int arr[],int low,int high,int x){
		
		//Base Cases
		//x is greater than all
		if(arr[high]<=x)
			return high;
		//x is smaller than
		if(arr[low]>x)
			return low;
		
		int mid=low+(high-low)/2;
		//if the element is greater than mid and less than equal to mid+1
		//then we have found the crossover point
		if(arr[mid]<=x && x<arr[mid+1])
			return mid;
		
		//if the mid is less than x then crossoverpoint may be arr[mid+1]
		//or it be lying in the arr[mid+1...high]
		if(arr[mid]<x)
			return findCrossOver(arr,mid+1,high,x);
		
		return findCrossOver(arr,low,mid-1,x);
	}
	
	
	private void printKClosest(int arr[],int x,int k){
		
		
		//Find the Crossover point to get the left index
		int left=findCrossOver(arr,0,arr.length-1,x);
		
		
		//Find the right index
		int right=left+1;
		
		//To Keep track of the elements already counted
		int count=0;
		
		//if the element is present in the array then decreement left index
		if(arr[left]==x)
			left--;
		
		//Print the k elements
		while(left>=0 && right<arr.length && count<k){
			
			if(x-arr[left] < arr[right]-x)
				System.out.print(arr[left--]+" ");
			else
				System.out.print(arr[right++]+" ");
			count++;
		}
		
		while(count<k && left>=0){
			System.out.print(arr[left--]+"  ");
		}
		while(count<k && right<arr.length){
			System.out.print(arr[right++]+" ");
		}
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem27 p=new Problem27();
		int k=4;
		int x=35;
		int arr[]={12,16,22,30,35,39,42,45,48,50,53,55,56};
		p.printKClosest(arr, x, k);
	}

}
