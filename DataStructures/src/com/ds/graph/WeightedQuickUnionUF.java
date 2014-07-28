package com.ds.graph;

public class WeightedQuickUnionUF extends UF{

	//Number of components 
	private int count;
	
	//id[i] = parent of i
	private int id[];
	
	//sz[i] = number of objects in subtree rooted at i
	private int sz[];
	
	public WeightedQuickUnionUF(int N){
		
		count=N;
		id=new int[N];
		sz=new int[N];
		for(int i=0;i<id.length;i++){
			id[i]=i;
			sz[i]=1;		
		}
	}
	
	
	@Override
	public void union(int p, int q) {
		// TODO Auto-generated method stub
		
		int rootP=find(p);
		int rootQ=find(q);
		if(rootP == rootQ)return;
		
		if(sz[rootP] < sz[rootQ]){
			id[rootP]=rootQ;
			sz[rootQ]+=rootP;
		}
		else{
			id[rootQ]=rootP;
			sz[rootP]+=rootQ;
		}
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

	
}
