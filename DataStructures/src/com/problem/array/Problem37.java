package com.problem.array;

/*
 * Go to top right element 
 * 
 * compare with the top right element 
 * 	i) if the element is less then go to left other wise go to right
 */

public class Problem37 {

	
	
	
	private boolean matrixSearch(int matrix[][],int rows,int columns,int element){
		
		
		int i=0;
		int j=columns-1;
		while(i<rows && j>=0){
			
			if(matrix[i][j]==element)
				return true;
			
			//Go Down
			if(matrix[i][j]<element)
				i++;
			else
				j--;
			
		}
		
		return false;
		
	}
	
	public void solve(){
		
		
		int matrix[][]={{10,20,30,40},
				        {15,25,35,45},
				        {27,29,37,48},
				        {32,33,39,50},
				       };
		int rows=4;
		int columns=4;
		int element=41;
		boolean found=matrixSearch(matrix,rows,columns,element);
		System.out.println("Is Element found "+found);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem37 p=new Problem37();
		p.solve();

	}

}
