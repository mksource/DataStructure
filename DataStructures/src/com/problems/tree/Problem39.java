package com.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem39 extends BinaryTree{

	public Problem39(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int countLeaf(BinaryNode root){
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		int numOfLeaf=0;
		q.add(root);
		while(!q.isEmpty()){
			
			BinaryNode temp=q.remove();
			
			if(temp.leftChild==null && temp.rightChild==null)
				numOfLeaf++;
			if(temp.leftChild!=null)
				q.add(temp.leftChild);
			if(temp.rightChild!=null)
				q.add(temp.rightChild);
			
		}
		return numOfLeaf;
		
	}

}
