package com.ds.graph;

/*
 * The Union-Find Solution solves the Dynamic Connectivity Problem
 * 
 * The input is a sequence of pair of integers where each integer will represent an object of a type and we interpret the pair (p,q) as p is connected to q
 * 
 * The Problem is read through the sequence of pair of integers and when a pair (p,q) is read from the input it should write the pair to the output if and only
 * if pairs seen so far do not imply that p is connected to q.
 */

public abstract class UF {

	    //Add a connection between p and q
		public abstract void union(int p,int q);
		
		
		//component identifier for p (0 to N-1)
		public abstract int find(int p);
		
		
		//returns true if p and q are in the same component
		public abstract boolean connected(int p,int q);
		
		//number of components
		public abstract int count();

}
