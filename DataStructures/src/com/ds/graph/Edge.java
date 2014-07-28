package com.ds.graph;

public class Edge implements Comparable<Edge>{
	
	
	private final int v;
	private final int w;
	private final double weight;

	/*
	 * Initilized a Edge between two vertices v and w
	 */
	public Edge(int v,int w,double weight){
		
		if(v < 0) throw new IndexOutOfBoundsException("Vertex name must be a nonnegative integer");
		if(w < 0) throw new IndexOutOfBoundsException("Vertex name must be a nonnegative integer");
		if(Double.isNaN(weight)) throw new IllegalArgumentException("weight is NaN");
		this.v=v;
		this.w=w;
		this.weight=weight;
		
		
	}
	
	//Return the Weight of the Edge
	public double weight(){
		return weight;
	}

	
	//Returns either endpoint of the edge
	public int either(){
		return v;
	}
	
	//Returns the other vertex that is different from given vertex
	public int other(int vertex){
		if(vertex == v) return w;
		else if(vertex == w) return v;
		throw new IllegalArgumentException("Illegal endpoint");
	}

	@Override
	public int compareTo(Edge that) {
		// TODO Auto-generated method stub
		if(this.weight < that.weight) return -1;
		else if(this.weight > that.weight) return 1;
		else return 0;
	}
	
	public String toString(){
		return String.format("%d-%d %.5f",v,w,weight);
	}
}
