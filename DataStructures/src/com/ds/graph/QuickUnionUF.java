package com.ds.graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.utils.StdIn;

public class QuickUnionUF extends UF{

	//number of components
	private int count;
	
	//id[i]=parent of i
	private int id[];
	
	
	public QuickUnionUF(int N){
		
		this.count=N;
		id=new int[N];
		for(int i=0;i<N;i++)
			id[i]=i;
	}
	
	
	@Override
	public void union(int p, int q) {
		// TODO Auto-generated method stub
		
		int rootP=find(p);
		int rootQ=find(q);
		if( rootP == rootQ)return;
		id[rootP]=rootQ;
		count--;
	}

	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
		while(p != id[p]){
			p=id[p];
		}
		return p;
	}

	@Override
	public boolean connected(int p, int q) {
		// TODO Auto-generated method stub
		return find(p) == find(q);
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
        QuickUnionUF uf = new QuickUnionUF(N);
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
