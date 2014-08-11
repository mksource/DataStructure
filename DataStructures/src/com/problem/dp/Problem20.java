package com.problem.dp;

public class Problem20 {
	
	
	/*
	 * Naive Solution would be  taking a vertex and considering 
	 * all the adjacent vertices and reduce the distance k-1 times till we reach the destination
	 * Worst time complexity would be o(V^k)
	 */
	public int countKEdges(boolean graph[][],int u,int v,int k,int V){
		
		
		//if we reach the destination node 
		if(k==0 && u==v) return 1;
		
		//if k is equal to 1 and the nodes are diretly connected
		if(k==1 && graph[u][v]==true) return 1;
		
		//if k becomes less than 0
		if(k < 0) return 0;
		
		//number of k edges between source and destination
		int count=0;
		
		for(int w=0;w<V;w++){
			if(graph[u][w])
				countKEdges(graph,w,v,k-1,V);
		}
		
		
		return count;
	}
	
	
	/*
	 * Dynamic Programming Solutions
	 * Construct a three dimensional matrix with 
	 * first  dimension would be source 
	 * second dimension would be destination
	 * third  dimension would be distance
	 * worst time complexity O(V^3k)
	 */
	public int countWalks(boolean graph[][],int u,int v,int k,int V)
	{
		
		//3-D matrix that will hold 
		int count[][][]=new int[V][V][k+1];
		
		
		for(int e=0;e<=k;e++){ //for each distance k
			for(int i=0;i<V;i++){ //for each source
				for(int j=0;j<V;j++){
					
					
					//base cases
					if(e==0 && i==j)
						count[i][j][e]=1;
					if(e==1 && graph[i][j])
						count[i][j][e]=1;
					if(e>1){
						//consider each vertex that is adjacent to a given vertex
						for(int w=0;w<V;w++){
							if(graph[i][w])
								count[i][j][e]+=count[w][j][e-1];
						}
						
					}
				}
			}
		}
		
		
		return count[u][v][k];
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
