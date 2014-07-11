package com.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

/*
 * To find the number of full nodes in the binary tree
 */

public class Problem40 extends BinaryTree{

	public Problem40(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int findFullNode(BinaryNode root){
		
		int numOfFullNodes=0;
		
		if(root==null)
			return numOfFullNodes;
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		q.add(root);
		while(!q.isEmpty()){
			
			BinaryNode temp=q.remove();
			if(temp.leftChild!=null && temp.rightChild!=null)
				numOfFullNodes++;
			if(temp.leftChild!=null)
				q.add(temp.leftChild);
			if(temp.rightChild!=null)
				q.add(temp.rightChild);
		}
		
		return numOfFullNodes;
		
	}

}
