package com.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem41 extends BinaryTree{

	public Problem41(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int countHalfNodes(BinaryNode root){
		
		int countHalfNodes=0;
		
		if(root==null)
			return countHalfNodes;
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		q.add(root);
		while(!q.isEmpty()){
			
			BinaryNode temp=q.remove();
			
			if((temp.leftChild==null && temp.rightChild!=null) || (temp.leftChild!=null && temp.rightChild==null))
				countHalfNodes++;
			
			if(temp.leftChild!=null)
				q.add(temp.leftChild);
			
			if(temp.rightChild!=null)
				q.add(temp.rightChild);
		}
		
		return countHalfNodes;
	}

}
