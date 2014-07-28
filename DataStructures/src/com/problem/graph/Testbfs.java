package com.problem.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.graph.Graph;
import com.ds.utils.StdIn;

public class Testbfs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdIn in=new StdIn();
		try {
			in.setScanner(new Scanner(new File("text/graph1.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Graph g=new Graph(in);
		int s=0;
		System.out.println("Graph "+g);
		BreadthFirstSearch bfs=new BreadthFirstSearch(g,s);
		System.out.println("Printing out the Breadth-First-Path ");
		for(int v=0;v<g.V();v++){
			
			System.out.print(s+" to"+v+":");
			for(int x:bfs.pathTo(v)){
				if(x == s)System.out.print(x);
				else System.out.print("- "+x);
			}
			System.out.println("");
		}
		

	}

}
