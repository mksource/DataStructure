package com.problem.array;

public class Problem03 {

	
	public void merge(int mPlusN[],int N[]){
		
		
		int n=N.length;
		int m=mPlusN.length-n;
		
		//Move all the valid element to the end in first array
		int j=m+n-1;
		for(int i=j;i>=0;i--){
			if(mPlusN[i]!=-1){
				mPlusN[j]=mPlusN[i];
				j--;
			}
		}
		
		//Merge the first array and second array
		int i=n;
		j=0;
		int k=0;
		
		while(k<(m+n)){
			
			if((i < (m+n) && mPlusN[i] < N[j])|| j==n){
				mPlusN[k]=mPlusN[i];
				i++;
				k++;
			}
			else{
				mPlusN[k]=N[j];
				j++;
				k++;
			}
		}
		
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem03 p=new Problem03();
		int mPlusN[]={2,8,-1,-1,-1,13,-1,15,20};
		int N[]={5,7,9,25};
		
		p.merge(mPlusN,N);
		for(int i=0;i<mPlusN.length;i++)
			System.out.print(mPlusN[i]+"\t");

	}

}
