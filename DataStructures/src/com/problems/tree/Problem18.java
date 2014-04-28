package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

public class Problem18 extends BinarySearchTree{

	private  int MAX_LEN=10;
	private int[] pathArray=new int[MAX_LEN];
	
	private void kDistanceFromLeaf(BinaryNode node,int k,int pathLength,boolean visited[]){
		
		if(node==null)
			return;
		
		pathArray[pathLength]=node.data;
		pathLength++;
		
		if(node.leftChild==null && node.rightChild==null && pathLength-k-1>=0 && visited[pathLength-k-1]==false){
			System.out.print(node.data+"\t");
		//	visited[pathLength-k-1]=true;
		}
		
		kDistanceFromLeaf(node.leftChild,k,pathLength,visited);
		kDistanceFromLeaf(node.rightChild,k,pathLength,visited);
	}
	public void compute(int k){
		
		boolean visited[]=new boolean[MAX_LEN];
		kDistanceFromLeaf(root,k,0,visited);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem18 p=new Problem18();
		p.insert(50);
		p.insert(80);
		p.insert(70);
		p.insert(90);
		p.insert(40);
		p.insert(45);
		p.insert(30);
		
		p.compute(1);
	}

}
