package com.problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem42 extends BinaryTree{

	public Problem42(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int maxSumLevel(BinaryNode root){
		
		int maxSumLevel=Integer.MIN_VALUE;
		int curSumLevel=0;
		int curLevel=1;
		int nextLevel=0;
		Queue<BinaryNode> q=new LinkedList<BinaryNode>();
		q.add(root);
		while(!q.isEmpty()){
			
			BinaryNode temp=q.remove();
			curSumLevel=temp.data;
			curLevel--;
			if(temp.leftChild!=null){
				nextLevel++;
			}
			if(temp.rightChild!=null){
				nextLevel++;
			}
			
			if(curLevel==0){
				curLevel=nextLevel;
				nextLevel=0;
				if(curSumLevel > maxSumLevel)
					maxSumLevel=curSumLevel;
			}
		}
		return maxSumLevel;
	}

}
