package com.ds.graph;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class AdjMatrixGraph {
	
	private int V;
	private int E;
	private boolean[][] adj;
	
	//empty graph with V vertices
	public AdjMatrixGraph(int v){
		if(v<0)throw new RuntimeException("Number of vertices must be non-negative");
		this.V=v;
		this.E=0;
		this.adj=new boolean[V][V];
	}

	
	//random graph with V vertices and E edges
	public AdjMatrixGraph(int V,int E){
		
		this(V);
		if(E<0)throw new RuntimeException("Number of Edges must be non-negative");
		if(E> V*(V-1)+V) throw new RuntimeException("Too many edges");
		
		while(this.E!=E){
			int v=(int)(V*Math.random());
			int w=(int)(V*Math.random());
			addEdge(v,w);
		}
	}
	
	//number of vertices and edges
	public int V(){ return V;}
	public int E(){ return E; }
	
	//add the undirected edge v-w
	public void addEdge(int v,int w){
		if(!adj[v][w])E++;
		adj[v][w]=true;
		adj[w][v]=true;
	}
	
	//does the graph contain edge v-w?
	public boolean contains(int v,int w){
		return adj[v][w];
	}
	
	//return the list of neighbours of v
	public Iterable<Integer> adj(int v){
		return new AdjIterator(v);
	}
	 
	private class AdjIterator implements Iterable<Integer>,Iterator<Integer>{
		
		int v,w=0;
		AdjIterator(int v){this.v=v;   }
		@Override
		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			return this;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			while(w<V){
				if(adj[v][w])return true;
				w++;
			}
			return false;
		}
		@Override
		public Integer next() {
			// TODO Auto-generated method stub
		    if(hasNext()) {return w++;}
		    else{throw new NoSuchElementException();}
		}
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
			
		}
	}
	
	 public String toString(){
	    	
	    	String s=V+" vertices, "+E+" edges\n";
	    	for(int v=0;v<V;v++){
	    		
	    		s+=v+": ";
	    		for(int w:this.adj(v))
	    			s+=w+" ";
	    		s+="\n";
	    	}
	    	return s;
	    }
	
	public static void main(String args[]){
		int V=10;
		int E=15;
		AdjMatrixGraph graph=new AdjMatrixGraph(V,E);
		System.out.println(graph);
	}
}
