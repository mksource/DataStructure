package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

/*
 * To calculate the hieght of the binary tree
 */
public class Problem04 extends BinarySearchTree{

	
	private int height(BinaryNode node){
		if(node==null)
			return 0;
		else{
			int lheight=height(node.leftChild);
			int rheight=height(node.rightChild);
			
			if(lheight>rheight)
				return lheight+1;
			else
				return rheight+1;
		}
	}
	public void compute(){
		
		System.out.println("The height of the binary tree "+height(root));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem04 p=new Problem04();
		
		p.insert(50);
		p.insert(60);
		p.insert(40);
		p.insert(30);
		p.insert(20);

	}

}
