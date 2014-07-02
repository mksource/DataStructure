package com.problem.array;

/*
 * Given two number m and n create a matrix with m rows and n columns The Xs and Os rextangle must
 * fill the matrix alternatively
 */


public class Problem29 {

	
	//m is the row
	//n is the column
	public void fillMatrix(int m,int n){
		
		int row=m;
		int column=n;
		char arr[][]=new char[row][column];
		int columnstart=0;
		int columnend=column;
		int rowstart=0;
		int rowend=row-1;
		boolean isX=true;
		while(m>0 && n>0){
			
			if(isX){
				printChar(arr,'X',rowstart,rowend,columnstart,columnend);
				isX=false;
			}
			else{
				printChar(arr,'O',rowstart,rowend,columnstart,columnend);
				isX=true;
			}
			rowstart++;
			rowend--;
			columnstart++;
			columnend--;
			m=m-2;
			n=n-2;
		}
		
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	private void printChar(char[][] arr,char X,int rowstart,int rowend,int columnstart,int columnend){
		
		//Print Upper X Line 
		for(int i=columnstart;i<columnend;i++)
			arr[rowstart][i]=X;
		
		//Print Botton X Line
		for(int i=columnstart;i<columnend;i++)
			arr[rowend][i]=X;
		
		//Print the Left X Line
		for(int i=rowstart;i<=rowend;i++)
			arr[i][columnstart]=X;
		
		//Print the Right X Line
		for(int i=rowstart;i<=rowend;i++)
			arr[i][columnend-1]=X;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem29 p=new Problem29();
		int m=4;
		int n=5;
		p.fillMatrix(m, n);
	}

}
