package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

public class Problem07 extends BinarySearchTree{

	/*
	 * Finding the lowest common ancestor 
	 * n1 < n2
	 */
	private BinaryNode lca(BinaryNode node,int n1,int n2){
		
		if(node==null)
			return null;
		
		if(node.data < n1 && node.data <n2)
			return lca(node.rightChild,n1,n2);
		if(node.data > n1 && node.data > n2)
			return lca(node.leftChild,n1,n2);
		return node;
	}
	public void compute(int n1,int n2){
		BinaryNode node=lca(root,n1,n2);
		if(node==null)
			System.out.println("Lowest common ancestor not found");
		else
			System.out.println("Lowest common ancestor is "+node.data);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem07 p=new Problem07();
		
		p.insert(20);
		p.insert(22);
		p.insert(8);
		p.insert(12);
		p.insert(14);
		p.insert(4);
		p.insert(10);
		
		p.displayTree();
		p.compute(4,14);
	}

}
