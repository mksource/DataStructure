package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;

/*
 * Find the minimum value in the binary search tree
 */

public class Problem09 extends BinarySearchTree{

	
	private BinaryNode min(BinaryNode node){
		
		if(node==null)
			return node;
		if(node.leftChild==null)
			return node;
		return min(node.leftChild);
		
	}
	public void compute(){
		BinaryNode node=min(root);
		System.out.println("The minimum value is "+node.data);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem09 p=new Problem09();
		
		p.insert(60);
		p.insert(70);
		p.insert(50);
		p.insert(40);
		p.insert(55);
		p.insert(30);
		p.compute();

	}

}
