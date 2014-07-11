package com.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
/*
 * Finding the maximum element in the binary tree without using recursion using level order traversal
 */
import com.ds.utils.StdIn;

public class Problem36 extends BinaryTree{

	public Problem36(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int  findMax(){
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		
		q.add(root);
		int max=Integer.MIN_VALUE;
		
		while(!q.isEmpty()){
			
			BinaryNode temp=q.remove();
			
			if(temp.data > max)
				max=temp.data;
			
			if(temp.leftChild!=null)
				q.add(temp.leftChild);
			
			if(temp.rightChild!=null)
				q.add(temp.rightChild);
		}
		
		return max;
		
		
	}

}
