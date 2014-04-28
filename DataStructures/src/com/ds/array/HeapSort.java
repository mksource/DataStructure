package com.ds.array;

public class HeapSort {
	
	
	private int numbers[];
	private int N;
	
	
	public void sort(int values[]){
		
		this.numbers=values;
		this.N=values.length-1;
		
		//Construct the heap within the array
		heapify(values);
		
		for(int i=N;i>0;i--){
			swap(0,i);
			N=N-1;
			maxHeap(values,0);
		}
		
	}
	private void heapify(int arr[]){
		
		for(int i=N/2;i>=0;i--)
			maxHeap(arr,i);
	}
	private void maxHeap(int arr[],int i){
		
		int left=2*i+1;
		int right=2*i+2;
		int max=i;
		
		if(left<=N && arr[left]>arr[max])
			max=left;
		if(right<=N && arr[right]>arr[max])
			max=right;
		
		if(max!=i){
			swap(i,max);
			maxHeap(arr,max);
		}
	}
	private void swap(int i,int j){
		int temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort sort=new HeapSort();
		int arr[]={45,89,12,6,23,18,21};
		sort.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
