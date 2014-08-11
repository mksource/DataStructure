package com.ds.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import com.ds.utils.StdIn;

public class SymbolGraph {
	
	private HashMap<String,Integer> ST;
	private Graph G;
	private String[] keys;
	
	
	
	//Constructor to build a Symbol Graph 
	public SymbolGraph(String filename,String delimiter) throws FileNotFoundException{
		
		//initialize the symbol table
		ST=new HashMap<String,Integer>();
		
		StdIn in=new StdIn();
		in.setScanner(new Scanner(new File(filename)));
		
		//First Pass will associate the strings within the file with vertex
		while(!in.isEmpty()){
			String a[]=in.readLine().split(delimiter);
			for(int i=0;i<a.length;i++){
				if(!ST.containsKey(a[i]))
					ST.put(a[i],ST.size());
			}
			
		}
		
		
		//Build an inerted index to get String Keys in an array
		keys=new String[ST.size()];
		for(String name : ST.keySet())
			keys[ST.get(name)]=name;
		
		//Second Pass will build the Graph
		G=new Graph(ST.size());
		in=new StdIn();
		in.setScanner(new Scanner(new File(filename)));
		while(in.hasNextLine()){
			String a[]=in.readLine().split(delimiter);
			int v=ST.get(a[0]);
			for(int i=1;i<a.length;i++){
				int w=ST.get(a[i]);
				G.addEdge(v, w);
			}
		}
		
		
	}
	
	//Returns true whether this graph contains a node with this name
	public boolean contain(String s){
		return ST.containsKey(s);
	}
	
	
	//Returns the index of this node name
	public Integer index(String s){
		return ST.get(s);
	}
	
	//Returns the value associated with this String
	public String name(int v){
		return keys[v];
	}
	
	//Returns the Graph associated with this Symbol Graph
	public Graph G(){
		return G;
	}

	/**Test client
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String filename  ="text/routes.txt";
	     String delimiter =" ";
	     SymbolGraph sg=null;
		 try {
				sg = new SymbolGraph(filename, delimiter);
		 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		 }
	      Graph G = sg.G();
	      System.out.println("The Graph associated with the symbol graph is "+G);
	        

	}

}
