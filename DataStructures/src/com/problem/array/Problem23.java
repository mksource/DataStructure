package com.problem.array;

/*
 * If we rotate the array by 90 degrees then 
 * 
 * first row of source becomes last column of destination
 * 
 * second row becomes the last but one row 
 * 
 * and so on
 */

public class Problem23 {

	private static void rotateMatrix(int matrix[][],int row,int col){
		
		int rotatedMatrix[][]=new int[col][row];
		
		//Rotate the Matrix
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				rotatedMatrix[j][row-i-1]=matrix[i][j];
			}
		}
		
		
		//Display the Matrix
		for(int i=0;i<col;i++){
			for(int j=0;j<row;j++){
				System.out.print(rotatedMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String args[]){
		
		int matrix[][]={{1,2,3,4},
				         {5,6,7,8},
				         {9,10,11,12}};
		
		rotateMatrix(matrix,3,4);
	}
}
