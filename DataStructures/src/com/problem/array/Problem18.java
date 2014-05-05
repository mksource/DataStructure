package com.problem.array;

public class Problem18 {

	
	public void compute(int [][]M,int r,int c){
		
		int rows[]=new int[r];
		int cols[]=new int[c];
		
		
		for(int i=0;i<r;i++)
			rows[i]=0;
		
		for(int j=0;j<c;j++)
			cols[j]=0;
		
		//Set if M[i][j] is equal to 1
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				
				if(M[i][j]==1){
					rows[i]=1;
					cols[j]=1;
				}
					
			}
		}
		
		
		//Modify the matrix
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				
				if(rows[i]==1 || cols[j]==1)
					M[i][j]=1;
			}
		}
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(M[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem18 p=new Problem18();
		int matrix[][]={{1,0,0,1},{0,0,1,0},{0,0,0,0}};
		p.compute(matrix, 3,4);
		
		
	}

}
