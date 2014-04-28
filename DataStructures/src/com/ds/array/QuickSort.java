package com.ds.array;

public class QuickSort {

	
	private int[] numbers;
	private int   number;
	
	
	public void sort(int[] values){
		
		if(values==null || values.length==0)
			return;
		this.numbers=values;
		this.number=values.length;
		quicksort(0,number-1);
	}
	private void exchange(int i,int j){
		int temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}
	private void quicksort(int low,int high){
		
		int i=low;
		int j=high;
		
		//Get the pivot from the middle of the element
		int pivot=numbers[low+(high-low)/2];
		
		while(i<=j){
			//Divide into two lists
			
			
			while(numbers[i]<pivot)
				i++;
			
			while(numbers[j]>pivot)
				j--;
			
			if(i<=j){
				exchange(i,j);
				i++;
				j--;
			}
			
			
		}
		
		if(low<j)
			quicksort(low,j);
		if(i<high)
			quicksort(i,high);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuickSort sort=new QuickSort();
		int arr[]={45,89,12,6,23,18,21};
		sort.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
