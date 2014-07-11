package com.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

/*
 * Finding the hieght of the binary tree without using recursion
 */

public class Problem44 extends BinaryTree{

	public Problem44(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	
	public int findHeight(BinaryNode root){
		
		if(root==null)
			return 0;
		
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		int level=0;
		int currentLvl=1;
		int nextLvl=0;
		q.add(root);
		
		
		while(!q.isEmpty()){
			
			//Pop the element from the front of the queue
			BinaryNode temp=q.remove();
			
			//Decrement the number of element in the current level by one
			currentLvl--;
			
			if(temp.leftChild!=null){
				q.add(temp.leftChild);
				nextLvl++;
			}	
			if(temp.rightChild!=null){
				q.add(temp.rightChild);
				nextLvl++;
			}	
			
			if(currentLvl==0){
				currentLvl=nextLvl;
				nextLvl=0;
				level++;
			}
			
		}
		
		return level;
		
		
		
	}

}
