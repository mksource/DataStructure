package com.problems.tree;

public class Problem19 {

	
	private int findLevel(int levels[],int arr[],int elem){
		
		//If the root element is found
		if(arr[elem]==-1){
			 levels[elem]=0;
			 return 1;
		}	 
		
		//If the parent element of this element is found
		if(levels[elem]!=-1){
			return levels[elem]+1;
		}
		
		
		levels[elem]=findLevel(levels,arr,arr[elem]);
		return levels[elem]+1;
			
	}
	
	private void printReverseLevelOrder(int arr[]){
		
		int n=arr.length;
		int levels[]=new int[n];
		
		
		for(int i=0;i<n;i++){
			levels[i]=-1;
		}
		
		for(int i=0;i<n;i++){
			
			int parent=arr[i];
			//If Parent is equal to -1
			if(parent==-1)
				levels[i]=0;
			else
				levels[i]=findLevel(levels,arr,parent);
			
		}
		
		for(int i=0;i<n;i++)
			System.out.print(levels[i]+" ");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem19 p=new Problem19();
		int arr[]={8,7,0,5,5,8,7,0,-1};
		int arr1[]={17, 25, 0 ,14 ,7 ,2 ,5, 25 ,18 ,8 ,16, 27, 10 ,9 ,19, 7 ,31 ,31 ,19 ,0 ,8, 14, 9, 17 ,18 ,2 ,30 ,16 ,30 ,10 ,5 ,-1, 27};
		p.printReverseLevelOrder(arr1);
		
		
	}

}
