package com.ds.graph;

import java.util.Stack;

import com.ds.list.Bag;
import com.ds.utils.StdIn;

public class EdgeWeightedGraph {

	//The number of vertices 
	private final int V;
	
	//The number of Edges
	private int E;
	
	//Arrays of Bags to hold the adajacency list of the vertex
	private Bag<Edge> adj[];
	
	//Construct a Graph given the number of vertices
	public EdgeWeightedGraph(int v){
		
		if(v < 0) throw new IllegalArgumentException("Number of vertices cannot be negative");
		this.V=v;
		this.E=0;
		this.adj=(Bag<Edge>[])new Bag[v];
		for(int i=0;i<v;i++)
			adj[i]=new Bag<Edge>();
		
	}
	
	
	//Construct a Random Graph given the number of edges and vertices
	public EdgeWeightedGraph(int v,int e){
			this(v);
			if(e<0)throw new IllegalArgumentException("The number of edges cannot be negative");
			this.E=e;
			for(int i=0;i<E;i++){
				
				int x=(int)(Math.random() * V);
				int y=(int)(Math.random() * V);
				double weight=Math.round(100 * Math.random()) / 100.0;
				Edge z=new Edge(x,y,weight);
				addEdge(z);
			}
	}
	
	//Construct a Graph from a input Stream
	public EdgeWeightedGraph(StdIn in){
		this(in.readInt());
		this.E=in.readInt();
		if(this.E < 0) throw new IllegalArgumentException("Number of edges cannot be negative");
		for(int i=0;i<this.E;i++){
			int v=in.readInt();
			int w=in.readInt();
			 double weight=in.readDouble();
			 Edge e=new Edge(v,w,weight);
			 addEdge(e);
		}
	}
	
	
	//Construct a Graph by doing a deep-copy of the graph
	public EdgeWeightedGraph(EdgeWeightedGraph G){
		this(G.V());
		this.E=G.E();
		
		for(int v=0;v<G.V();v++){
			
			Stack<Edge> reverse=new Stack<Edge>();
			
			//Add the edges incident on this vertex to a stack so that we can maintain same 
			for(Edge e: G.adj(v)){
				reverse.push(e);
			}
			
			for(Edge e:reverse){
				adj[v].add(e);
			}
			
			
		}
	}
	
	//Return the number of Vertices in the graph
	public int E(){
		return E;
	}
	
	//Return the number of Edges in the graph
	public int V(){
		return V;
	}
	
	
	//Add an Edge to the Graph
	public void addEdge(Edge e){
		
		int v=e.either();
		int w=e.other(v);
		if( v < 0 || v >= V) throw new IndexOutOfBoundsException("vertex "+v+" is not between 0 and "+(V-1));
		if( w <0  || w >= V) throw new IndexOutOfBoundsException("vertex"+w+" is not between 0 and "+(V-1));
		adj[v].add(e);
		adj[w].add(e);
		E++;
		
	}
	
	//Return all the Edges incident on the Vertex V
	public Iterable<Edge> adj(int v){
		if(v < 0 || V >=V) throw new IndexOutOfBoundsException("vertex "+v+" is not between 0 and "+(V-1));
		return adj[v];
	}
	
	//Return all the edges in the Graph
	public Iterable<Edge> edges(){
		
		Bag<Edge> list=new Bag<Edge>();
		for(int v=0;v<this.V;v++){
			
			//Add only one copy of the self loop
			int selfloop=0;
			for(Edge e:adj(v)){
				
				if(e.other(v) > v)
					list.add(e);
				else if(e.other(v) == v){
					if(selfloop % 2 == 0)list.add(e);
					selfloop++;
				}
			}
			
		}
		return list;
	}
	
	
	public String toString(){
		
		String NEWLINE= System.getProperty("line.separator");
		StringBuilder s=new StringBuilder();
		s.append(V+"  "+E+NEWLINE);
		for(int v=0;v<V;v++){
			s.append(v+": ");
			for(Edge e:adj(v)){
				s.append(e+" ");
			}	
			s.append(NEWLINE);
		}
		
		return s.toString();
	}

}
