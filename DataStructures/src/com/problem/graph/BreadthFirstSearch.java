package com.problem.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.ds.graph.Graph;

/*
 * This method will do the breadth first traversal of the graph
 */
public class BreadthFirstSearch {

	private boolean[]  marked;
	private int        count;
	private int[]     edgeTo;
	private int source;
	
	public BreadthFirstSearch(Graph g,int s){
		
		//Visited Array for the vertices
		marked=new boolean[g.V()];
		
		//Number of Visited vertices
		count=0;
		
		//Source vertex
		this.source=s;
		
		//The edgeTo array conatining the parent node
		this.edgeTo=new int[g.V()];
		
		bfs(g,s);
	}
	
	public void bfs(Graph g,int s){
		
		
		//Maintain a Queue of Nodes
		Queue<Integer> q=new LinkedList<Integer>();
		
		//Add the source vertex to the queue
		q.add(s);
		marked[s]=true;
		
		
		while(!q.isEmpty()){
			
			int v=q.remove();
			
			for(int w:g.adj(v)){
				if(!marked[w]){
					
					//Mark the node as visited
					marked[w]=true;
				
					//Add the visited node to the Queue
					q.add(w);
					
					//Mark the edgeTo  vertex for this vertex
					edgeTo[w]=v;
					
					//Increement the number of nodes visited
					count++;
				}	
			}		
			
		}
		
		
	}
	
	public boolean marked(int w){
		return marked[w];
	}
	
	
	public int count(){
		return count;
	}
	public boolean hasPathTo(int v){
		return marked[v];
	}
public Iterable<Integer> pathTo(int v){
		
		if(!hasPathTo(v))return null;
		Stack<Integer> path=new Stack<Integer>();
		for(int x=v;x!=source;x=edgeTo[x])
			path.push(x);
		path.push(source);
		return path;
		
	}

}
