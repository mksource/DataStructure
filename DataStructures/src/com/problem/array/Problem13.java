package com.problem.array;

import com.ds.list.MaxHeap;
import com.ds.list.MinHeap;

public class Problem13 {

	
	private static void extractKLargest(int[] arr,int k){
		
		MaxHeap heap=new MaxHeap(arr.length);
		for(int i=0;i<arr.length;i++){
			heap.insert(arr[i]);
		}
		
		for(int i=0;i<k;i++)
			System.out.print(heap.remove()+"\t");
			
	}
	private static void extractKSmallest(int[] arr,int k){
		
		MinHeap heap=new MinHeap(arr.length);
		for(int i=0;i<arr.length;i++)
			heap.insert(arr[i]);
		
		for(int i=0;i<k;i++)
			System.out.println(heap.remove()+"\t");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr[]={56,89,34,12,2,90,23};
		 
		 extractKLargest(arr,3);
		 extractKSmallest(arr,3);
	}

}
