package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;

public class Problem22 extends BinarySearchTree{

	private int max(int a,int b){
		return (a>b)?a:b;
	}
	
	private int height(BinaryNode node){
		
		if(node==null)
			return 0;
		else
			return 1+max(height(node.leftChild),height(node.rightChild));
	}
	public boolean isHieghtBalanced(BinaryNode node){
		
		if(node==null)
			return true;
		int lh;
		int rh;
		
		lh=height(node.leftChild);
		rh=height(node.rightChild);
		
		if(Math.abs(lh-rh)<=1 && isHieghtBalanced(node.leftChild) && isHieghtBalanced(node.rightChild))
			return true;
		else
			return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
