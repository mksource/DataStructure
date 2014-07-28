package com.problem.graph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.ds.graph.Edge;
import com.ds.graph.EdgeWeightedGraph;
import com.ds.graph.QuickUnionUF;

/*
 * Kruskal Algorithm will run process the edges in the order of the weight values (smallest to largest) taking the edge for MST if it does not form a 
 * cycle with the previously formed edges and stopping after V-1 edges.
 */

public class Kruskal {

	
	//Weight of the MST
	private double weight;
	
	//edges in the minimum spanning Tree
	private Queue<Edge> mst;
	
	
	public Kruskal(EdgeWeightedGraph G){
		
		//Build a queue to hold edges in MST
		mst=new LinkedList<Edge>();
		
		//Build a Priority Queue to hold the edges in minimum order
		PriorityQueue<Edge> queue=new PriorityQueue<Edge>();
		for(Edge e:G.edges()){
			queue.add(e);
		}
				
		//Build a Union-Find data structure to find out whether adding an edge forms a cycle
		QuickUnionUF uf=new QuickUnionUF(G.V());
		
		
		//Run the Greedy Algorithm
		while(!queue.isEmpty() && mst.size() != G.V()){
			
			//Extract the next minimum weight edge from the priority queue
			Edge e=queue.remove();
			
			//Get the vertices of the edge
			int v=e.either();
			int w=e.other(v);
			
			//Check if these two vertices are connected if not add them to minimum spanning tree
			if(!uf.connected(v, w)){
				uf.union(v, w);
				mst.add(e);
				weight+=e.weight();
			}
		}
		
	}
	
	//Return the weight of the Minimum spanning Tree
	public double weight(){
		return weight;
	}
	
	
	//Return the edges in the Minimum Spanning Tree
	public Iterable<Edge> edges(){
		return mst;
	}

}
