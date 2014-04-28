package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

/*
 * The Right View of the Binary Tree is the set of nodes when viewed from the right side
 */

public class Problem15 extends BinarySearchTree {

	
	private int maxlevel=0;
	
	private void rightView(BinaryNode node,int level){
		
		if(node==null)
			return;
		if(maxlevel<level){
			System.out.print(node.data+"\t");
			maxlevel=level;
		}
		
		rightView(node.rightChild,level+1);
		rightView(node.leftChild,level+1);
	}
	
	public void compute(){
		rightView(root,1);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem15 p=new Problem15();
		
		p.insert(80);
		p.insert(100);
		p.insert(120);
		p.insert(86);
		p.insert(140);
		p.insert(60);
		p.insert(70);
		p.insert(45);
		
		p.compute();

	}

}
