package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem47 extends BinaryTree{

	public Problem47(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isMirror(BinaryNode tree1,BinaryNode tree2){
		
		//If both the trees are empty then return true
		if(tree1==null && tree2==null)
			return true;
		
		//If one of the tree is empty and other one is not then return false
		if(tree1==null || tree2==null)
			return false;
		
		//Check for the data left subtree right subtree
		return (tree1.data == tree2.data && isMirror(tree1.leftChild,tree2.rightChild) && isMirror(tree1.rightChild,tree2.rightChild));
		
	}

}
