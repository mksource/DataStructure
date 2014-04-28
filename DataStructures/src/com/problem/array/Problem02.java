package com.problem.array;

import java.util.Arrays;

/*Median of two sorted array*/

public class Problem02 {

	
	/*Simply count while merging*/
	private int method1(int arr1[],int arr2[],int N){
		
		int i=0;
		int j=0;
		int m1=-1,m2=-1;
		
		for(int count=0;count<=N;count++){
			
			if(i==N){
				m1=m2;
				m2=arr2[j];
				break;
			}
			else if(j==N){
				m1=m2;
				m2=arr1[i];
				break;
			}
			
			if(arr1[i]<arr2[j]){
				m1=m2;
				m2=arr1[i];
				i++;
			}
			
			else{
				m1=m2;
				m2=arr2[i];
				j++;
			}
		}
		
		return (m1+m2)/2;
		
	}
	private int max(int a,int b){
		return(a>b)?a:b;
	}
	private int min(int a,int b){
		return (a<b)?a:b;
	}
	private int median(int arr[],int n){
		if(n%2==0)
			return (arr[n/2]+arr[n/2-1])/2;
		else
			return arr[n/2];
	}
	private int method2(int arr1[],int arr2[],int n){
		
		int m1;
		int m2;
		/*return -1 for invalid input*/
		if(n==1)
			return -1;
		
		if(n==2)
			return (max(arr1[0],arr2[0])+min(arr1[1],arr2[1]))/2;
		
		m1=median(arr1,n);
		m2=median(arr2,n);
		
		//Then the median must exist in the range arr1[m1....] to arr2[...m2]
		if(m1<m2){
			if(n%2==0)
				return method2(Arrays.copyOfRange(arr1,n/2-1,n),arr2,n-n/2+1);
			else
				return method2(Arrays.copyOfRange(arr2,n/2,n),arr2,n-n/2);
		}
		//Then median must exist in the range arr2[m2...] to arr1[...m1]
		else{
			if(n%2==0)
				return method2(arr1,Arrays.copyOfRange(arr2,n/2-1,n),n-n/2+1);
			else
				return method2(arr1,Arrays.copyOfRange(arr2,n/2,n),n-n/2);
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem02 p=new Problem02();
		int arr1[]={1,12,15,26,28};
		int arr2[]={2,13,17,30,45};
		int median1=p.method1(arr1, arr2,arr1.length-1);
		int median2=p.method2(arr1, arr2,arr1.length);
		System.out.println("The median of sorted arrays using method1 "+median1);
		System.out.println("The median of sorted arrays using method2 "+median2);

	}

}
