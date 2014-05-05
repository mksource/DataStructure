package com.problem.array;

/*
 * Printing a matrix in a spiral form
 */

public class Problem19 {

	
	public void spiralMatrix(int m[][],int r,int c){
		
		int i=0;
		int k=0;
		int l=0;
		/* i is iterator
		 * k is startting row index
		 * l is starting  column index
		 * r is ending row index 
		 * c  is ending column index
		 * 
		 */
		while(k<r && l<c){
			
			//Print the first row 
			for(i=l;i<c;i++)
				System.out.print(m[k][i]+" ");
			
			k++;
			
			//Print the last column
			for(i=k;i<r;i++)
				System.out.print(m[i][c-1]+" ");
			c--;
			
			//Print the last row
			if(k<r){
				for(i=c-1;i>=l;i--)
					System.out.print(m[r-1][i]+" ");
				r--;
			}
			
			//Print the first column
			if(l<c){
				for(i=r-1;i>=k;i--)
					System.out.print(m[i][l]+" ");
				l++;
			}
			
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem19 p=new Problem19();
		int matrix1[][]={ {1,2,3,4},
				          {5,6,7,8},
				          {9,10,11,12},
				          {13,14,15,16}
				 		};
		
		p.spiralMatrix(matrix1, 4, 4);
		
	}

}
