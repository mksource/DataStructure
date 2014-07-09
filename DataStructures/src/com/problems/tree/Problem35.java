package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem35 extends BinaryTree{

	
	public Problem35(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	public int findMax(BinaryNode root){
		int root_val,left,right,max=Integer.MIN_VALUE;
		if(root!=null){
			root_val=root.data;
			left=findMax(root.leftChild);
			right=findMax(root.rightChild);
			
			if(left > right)
				max=left;
			else
				max=right;
			if(root_val>max)
				max=root_val;
		
		}
		return max;
		
		
	}
	

}
