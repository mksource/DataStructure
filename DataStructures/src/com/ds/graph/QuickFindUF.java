package com.ds.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.utils.StdIn;

public class QuickFindUF extends UF{
	
	
	//numbers of components
	private int count;
	
	//id[i] = component identifier for i
	private int[] id;
	
	//initialize with the number of components
	public QuickFindUF(int N){
		
		//Initially there are N components
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++)
			id[i]=i;
	}

	@Override
	public void union(int p, int q) {
		// TODO Auto-generated method stub
		if(connected(p,q))return;
		int pid=id[p];
		for(int i=0;i<id.length;i++)
			if(id[i] == pid) id[i]=id[q];
		count--;
		
	}

	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
		return id[p];
	}

	@Override
	public boolean connected(int p, int q) {
		// TODO Auto-generated method stub
		return id[p]==id[q];
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return count;
	}
	
	
	//Test client
	public static void main(String[] args) {
		
		StdIn in=new StdIn();
		try {
			in.setScanner(new Scanner(new File("text/tinyUF.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int N = in.readInt();
        QuickFindUF uf = new QuickFindUF(N);
        while (!in.isEmpty()) {
            int p = in.readInt();
            int q = in.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            System.out.println(p + " " + q);
        }
        System.out.println(uf.count() + " components");
    }

	

}
