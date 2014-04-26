package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

public class Problem11 extends BinarySearchTree{

	
	
	private int getLeafCount(BinaryNode node){
		if(node==null)
			return 0;
		if(node.leftChild==null && node.rightChild==null)
			return 1;
		return getLeafCount(node.leftChild)+getLeafCount(node.rightChild);
	}
	public void compute(){
		System.out.println("The number of leaves in the tree "+getLeafCount(root));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem11 p=new Problem11();
		p.insert(60);
		p.insert(50);
		p.insert(80);
		p.insert(90);
		p.insert(95);
		p.insert(100);
		p.insert(40);
		p.insert(30);
		p.insert(20);
		p.insert(35);
		
		p.compute();

	}

}
