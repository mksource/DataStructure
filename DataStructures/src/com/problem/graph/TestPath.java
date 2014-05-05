package com.problem.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.graph.Graph;
import com.ds.utils.StdIn;

public class TestPath {
	
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
		DepthFirstPaths path=new DepthFirstPaths(G,s);
		for(int v=0;v<G.V();v++){
			
			System.out.println(s+" to"+v+": ");
			if(path.hasPathTo(v)){
				for(int x:path.pathTo(v))
					if(x==s)System.out.print(x);
					else System.out.print("- "+x);
			}
			System.out.println();
		}
	}

}
