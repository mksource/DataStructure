package com.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem38 extends BinaryTree{

	public Problem38(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public boolean findSearch(BinaryNode root,int element){
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		q.add(root);
		while(!q.isEmpty()){
			
			BinaryNode temp=q.remove();
			if(temp.data == element)
				return true;
			if(temp.leftChild!=null)
				q.add(root.leftChild);
			if(temp.rightChild!=null)
				q.add(root.rightChild);
			
		}
		return false;
	}
	

}
