package com.ds.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

import com.ds.list.Bag;
import com.ds.utils.StdIn;

public class Digraph {

	
	//Number of Vertices 
	private int V;
	
	//Number of Edges
	private int E;
	
	//The Adjacency List
	private Bag<Integer>[] adj;
	
	
	//Constructor to initialize the Graph with the number of vertices
	public Digraph(int V){
		
		if(V < 0) throw new IllegalArgumentException("Number of vertices cannot be negative");
		this.V=V;
		this.E=0;
		adj=(Bag<Integer>[])new Bag[V];
		for(int v=0;v<V;v++){
			adj[v]=new Bag<Integer>();
		}
	}
	
	//Constructor to initialize the Digraph from inputStream
	public Digraph(StdIn in){
		 try {
	            this.V = in.readInt();
	            if (V < 0) throw new IllegalArgumentException("Number of vertices in a Digraph must be nonnegative");
	            adj = (Bag<Integer>[]) new Bag[V];
	            for (int v = 0; v < V; v++) {
	                adj[v] = new Bag<Integer>();
	            }
	            int E = in.readInt();
	            if (E < 0) throw new IllegalArgumentException("Number of edges in a Digraph must be nonnegative");
	            for (int i = 0; i < E; i++) {
	                int v = in.readInt();
	                int w = in.readInt();
	                addEdge(v, w); 
	            }
	        }
	        catch (NoSuchElementException e) {
	            throw new InputMismatchException("Invalid input format in Digraph constructor");
	        }
		
	}
	
	
	//Constructor a Digraph that is a deep copy of the Graph
	 public Digraph(Digraph G) {
	        this(G.V());
	        this.E = G.E();
	        for (int v = 0; v < G.V(); v++) {
	            // reverse so that adjacency list is in same order as original
	            Stack<Integer> reverse = new Stack<Integer>();
	            for (int w : G.adj[v]) {
	                reverse.push(w);
	            }
	            for (int w : reverse) {
	                adj[v].add(w);
	            }
	        }
	    }
	
	//Return the number of Vertices in the graph
	public int V(){
		return V;
	}
	
	//Return the number of Edges in the graph
	public int E(){
		return E;
	}
	
	//Add an edge to the directed graph
	public void addEdge(int v,int w){
		
		if(v <0 || v>V) throw new IllegalArgumentException("Vertex "+v+" is not between 0 and "+(V-1));
		if(w <0 || w>V) throw new IllegalArgumentException("Vertex "+w+" is not between 0 and "+(V-1));
		adj[v].add(w);
		E++;
	}
	
	//Returns the adjacency list
	 public Iterable<Integer> adj(int v) {
	        if (v < 0 || v >= V) throw new IndexOutOfBoundsException();
	        return adj[v];
	    }
	
	
	//Return the Reverse of the Graph
	public Digraph reverse() {
        Digraph R = new Digraph(V);
        for (int v = 0; v < V; v++) {
            for (int w : adj(v)) {
                R.addEdge(w, v);
            }
        }
        return R;
    }
	
	//String Representation of the Directed Graph
	 public String toString() {
	        StringBuilder s = new StringBuilder();
	        String NEWLINE = System.getProperty("line.separator");
	        s.append(V + " vertices, " + E + " edges " + NEWLINE);
	        for (int v = 0; v < V; v++) {
	            s.append(String.format("%d: ", v));
	            for (int w : adj[v]) {
	                s.append(String.format("%d ", w));
	            }
	            s.append(NEWLINE);
	        }
	        return s.toString();
	    }
	 
	 
	 
	 //Test Client for the Directed Graph
	  public static void main(String[] args) {
	       
		  StdIn in=new StdIn();
			try {
				in.setScanner(new Scanner(new File("text/tinyDG.txt")));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Digraph G = new Digraph(in);
	        System.out.println("The Directed Graph is ");
	        System.out.print(G);
	        
	    }

	
	
}
