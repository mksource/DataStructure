package com.problem.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.graph.Graph;
import com.ds.utils.StdIn;

public class TestSearch {

	public static void main(String args[]){
		
		StdIn in=new StdIn();
		try {
			in.setScanner(new Scanner(new File("text/graph1.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Graph G=new Graph(in);
		int s=0;
		DepthFirstSearch search=new DepthFirstSearch(G,s);
		
		for(int v=0;v<G.V();v++)
			if(search.marked(v))
				System.out.print(v+" ");
		
		System.out.println();
		if(search.count()!=G.V())
			System.out.print("NOT ");
		System.out.println("Connected");
	}
}
