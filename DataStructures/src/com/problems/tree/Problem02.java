package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

/*
 * Method to find out the size of the binary search tree
 */

public class Problem02 extends BinarySearchTree{

	
	public int size(){
		return size(root);
	}
	private int size(BinaryNode node){
		if(node==null)
			return 0;
		else return 1+size(node.leftChild)+size(node.rightChild);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem02 tree=new Problem02();
		
		tree.insert(70);
		tree.insert(80);
		tree.insert(50);
		tree.insert(30);
		tree.insert(40);
		tree.insert(85);
		
		
		System.out.println("The size of binary tree is "+tree.size());
	}

}
