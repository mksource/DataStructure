package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem46 extends BinaryTree{

	public Problem46(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int findSum(BinaryNode root){
		
		if(root==null)
			return 0;
		return root.data+findSum(root.leftChild)+findSum(root.rightChild);
	}

}
