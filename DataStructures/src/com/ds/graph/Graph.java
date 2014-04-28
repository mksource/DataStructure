package com.ds.graph;

import com.ds.list.Bag;
import com.ds.utils.StdIn;

/*Implementing a graph in adjacent list representation*/
public class Graph {
	
	private final int V;
	private int E;
	private Bag<Integer> adj[];
	
	
	public Graph(int v){
		if(v<0)throw new IllegalArgumentException("Number of vertices must be non-negative");
		this.V=v;
		this.E=0;
		adj=(Bag<Integer>[])new Bag[v];
		for(int i=0;i<v;i++)
			adj[v]=new Bag<Integer>();
	}
	
	public Graph(StdIn in){
		this(in.readInt());
		int E=in.readInt();
		if(E<0) throw new IllegalArgumentException("Number of edges must be nonnegative");
		for(int i=0;i<E;i++){
			int v=in.readInt();
			int w=in.readInt();
			addEdge(v,w);
		}
	}
	
	
	public int V(){
		return V;
	}
	public int E(){
		return E;
	}
    public void addEdge(int v,int w){
    	if(v<0 || v>=V)throw new IndexOutOfBoundsException();
    	if(w<0 || w>=V)throw new IndexOutOfBoundsException();
    	E++;
    	adj[v].add(w);
    	adj[w].add(v);
    	
    }
	
}
