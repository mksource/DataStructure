package com.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem45 extends BinaryTree{

	public Problem45(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public BinaryNode findDeepestNode(BinaryNode root){
		
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		BinaryNode temp = null;
		q.add(root);
		while(!q.isEmpty()){
			
			temp=q.remove();
			if(temp.leftChild!=null)
				q.add(temp.leftChild);
			if(temp.rightChild!=null)
				q.add(temp.rightChild);
			
		}
		return temp;
	}

}
