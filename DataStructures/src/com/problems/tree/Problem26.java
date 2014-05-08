package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;

public class Problem26 extends BinarySearchTree{

	public boolean isBST(BinaryNode root){
		
		return isBSTUtils(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean isBSTUtils(BinaryNode root,int min,int max){
		
		if(root==null)
			return true;
		
		if(root.data<min || root.data>max)
			return false;
		
		//Recursively check for the left and right subtrees
		return isBSTUtils(root.leftChild,min,root.data-1) && isBSTUtils(root.rightChild,root.data+1,max);
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
