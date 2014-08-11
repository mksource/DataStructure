package com.problem.graph;


/*
 * This algorithm will calculate the All-Pairs shortest Path algorithm for a graph
 */

public class FloydWarshall {

	
	/*
	 * This algorithm will consider each vertex k as an intermediate vertex 
	 * and if for each pair if dist [i][k]+ dist [j][j] is less than 
	 * dist[i][j] then that passing through k will be considered as the 
	 * shortest path Time Complexity is O(V^3)
	 */
	 public  static int INF=Integer.MAX_VALUE;
	
	 public void floydWarshall(int graph[][],int V){
		 
		 
		 //Build a Solution Matrix and initialise with the distance matrix
		 int dist[][]=new int[V][V] ;
		 
		 for(int i=0;i<V;i++){
			 for(int j=0;j<V;j++){
				 dist[i][j]=graph[i][j];
			 }
		 }
		 
		 //consider each vertex k as intermediate vertex and calculate the shortest path
		 for(int k=0;k<V;k++){
			 for(int i=0;i<V;i++){
				 for(int j=0;j<V;j++){
					 
					 if(dist[i][k]+dist[k][j] < dist[i][j])
						 dist[i][j]=dist[i][k]+dist[k][j];
				 }
			 }
		 }
	 }
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int graph[][]={{0,5,INF,10},
				       {INF,0,3,INF},
				       {INF,INF,0,1},
				       {INF,INF,INF,0}};
		FloydWarshall sol=new FloydWarshall();
		sol.floydWarshall(graph, 4);

	}

}
