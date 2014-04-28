package com.ds.array;

public class MergeSort {

	
	private int[] numbers;
	private int[] helper;
	
	public void sort(int[] values){
		this.numbers=values;
		int len=values.length;
		helper=new int[len];
		mergesort(numbers,0,len-1);
	}
	
	private void mergesort(int arr[],int low,int high){
		if(low<high){
			
			int mid=low+(high-low)/2;
			
			//Sort the lower part of the array
			mergesort(arr,low,mid);
			
			//Sort the higher part of the array
			mergesort(arr,mid+1,high);
			
			//Merge the lower and higher part of the array
			merge(low,mid,high);
		}
	}
	
	private void merge(int low,int middle,int high){
		
		for(int i=low;i<=high;i++){
			helper[i]=numbers[i];
		}
		
		int i=low;
		int j=middle+1;
		int k=low;
		
		while(i<=middle && j<=high){
			if(helper[i]<helper[j]){
				numbers[k]=helper[i];
				i++;
				k++;
			}
			else{
				numbers[k]=helper[j];
				j++;
				k++;
			}
		}
		
		while(i<=middle){
			numbers[k]=helper[i];
			i++;
			k++;
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSort sort=new MergeSort();
		int arr[]={45,89,12,6,23,18,21};
		sort.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
