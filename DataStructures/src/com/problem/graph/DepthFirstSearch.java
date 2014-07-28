package com.problem.graph;

import com.ds.graph.Graph;
/*
 * This will do a Depth first Search of the Graph
 */

public class DepthFirstSearch {
	
	private boolean[] marked;
	private int       count;
	
	public DepthFirstSearch(Graph G,int s){
		marked=new boolean[G.V()];
		dfs(G,s);
	}
	private void dfs(Graph g,int v){
		marked[v]=true;
		count++;
		for(int w:g.adj(v))
			if(!marked[w])dfs(g,w);
	}
	
	public boolean marked(int w){
		return marked[w];
	}
	public int count(){
		return count;
	}

}
