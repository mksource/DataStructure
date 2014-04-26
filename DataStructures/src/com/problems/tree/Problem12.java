package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class Problem12 extends BinarySearchTree{

	
	private void spiralorder(BinaryNode root){
		
		Deque<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		int level=1;
		while(!queue.isEmpty()){
			
			
			
		}
	}
	public void compute(){
		spiralorder(root);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
