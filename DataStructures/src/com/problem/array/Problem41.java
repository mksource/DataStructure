package com.problem.array;

/*
 * Find the number of occurrences of a given element in a sorted array
 */

public class Problem41 {

	
		
	//Find the first occurrence of the repeating element
	public int first(int low,int high,int arr[],int element,int n){
		
		if(high>=low){
			
			int mid=low+(high-low)/2;
			
			if((mid==0 || arr[mid-1]<element) && arr[mid]==element){
				return mid;
			}
			else if(element > arr[mid])
				return first(mid+1,high,arr,element,n);
			else
				return first(low,mid-1,arr,element,n);
		}
		return -1;
	}
		 
	
	//Find the last occurrence of the repeating element
	public int last(int low,int high,int arr[],int element,int n){
		if(high>=low){
			
			int mid=low+(high-low)/2;
			if((mid==n-1 || element<arr[mid+1]) && arr[mid]==element){
				return mid;
			}
			else if(element < arr[mid])
				return last(low,mid-1,arr,element,n);
			else
				return last(mid+1,high,arr,element,n);
		}
		return -1;
	}
	
	public void findOcurrences(int a[],int element){
		
		int n=a.length;
		
		//Find the first occurrence and the last occurrence
		int i=first(0,n-1,a,element, n);
		
		if(i==-1){
			System.out.println("Element not found");
			return;
		}
		
		//Find the last occurrence of the repeating element
		int j=last(0,n-1,a,element,n);
		if(j==-1){
			System.out.println("Only one occurrence of the element found");
			return;
		}
		
		System.out.println("The number of occurrences of element is"+(j-i+1));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem41 p=new Problem41();
		int arr1[]={1, 1, 2, 2, 2, 2, 3,};
		int arr2[]={1, 1, 2, 2, 2, 2, 3,};
		int arr3[]={1, 1, 2, 2, 2, 2, 3,};
		int arr4[]={1, 1, 2, 2, 2, 2, 3,};
		p.findOcurrences(arr1, 2);
		p.findOcurrences(arr2,3);
		p.findOcurrences(arr3, 1);
		p.findOcurrences(arr4,4);
		
	}

}
