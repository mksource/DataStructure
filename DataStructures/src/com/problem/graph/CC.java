package com.problem.graph;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.graph.Graph;
import com.ds.utils.StdIn;

public class CC {

	//This will check whether the graph is connected or not
	//If the graph is not connected then it will print out the number of connected components in the graph
	
	
	//number of connected components
	private int count;
	private int[] size;
	private int[] id;
	private boolean marked[];
	
	public CC(Graph g){
		
		size=new int[g.V()];
		marked=new boolean[g.V()];
		id=new int[g.V()];
		
		for(int v=0;v<g.V();v++){
			if(!marked[v]){
				dfs(g,v);
				count++;
			}
		}
	}
	
	private void dfs(Graph G,int v){
		
		marked[v]=true;
		id[v]=count;
		size[count]++;
		for(int w : G.adj(v)){
			if(!marked[w]){
				dfs(G,w);
			}
		}
	}
	
	
	//Number of connected components
	public int count(){
		return count;
	}
	
	//Are these two vertices connected
	public boolean areConnected(int v,int w){
		return id[v] == id[w];
	}
	
	//Return the component identifier of the given vertex
	public int id(int v){
		return id[v];
	}
	
	
	//Return the number of vertices in the component same as given vertex
	public int size(int v){
		return size[id[v]];
	}
	
	//Test Client
	public static void main(String args[]){
		 StdIn in = new StdIn();
	        Graph G = new Graph(in);
	        CC cc = new CC(G);

	        // number of connected components
	        int M = cc.count();
	        System.out.println(M + " components");

	        // compute list of vertices in each connected component
	        Queue<Integer>[] components = (LinkedList<Integer>[]) new LinkedList[M];
	        for (int i = 0; i < M; i++) {
	            components[i] = new LinkedList<Integer>();
	        }
	        for (int v = 0; v < G.V(); v++) {
	            components[cc.id(v)].add(v);
	        }

	        // print results
	        for (int i = 0; i < M; i++) {
	            for (int v : components[i]) {
	                System.out.print(v + " ");
	            }
	            System.out.println();
	        }
	}

}
