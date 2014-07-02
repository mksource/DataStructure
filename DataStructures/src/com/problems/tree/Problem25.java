package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;

public class Problem25 extends BinarySearchTree{

	
	public void printAncestors(BinaryNode node,int data){
		
		if(node==null)
			return;
		
		if(node.data == data)
			return;
		
		System.out.println(node.data);
		
		if(data < node.data)
			printAncestors(node.leftChild, data);
		else
			printAncestors(node.rightChild, data);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem25 p=new Problem25();
		p.insert(60);
		p.insert(50);
		p.insert(80);
		p.insert(40);
		p.insert(30);
		p.insert(70);
		p.insert(30);
		
		p.printAncestors(p.root,30);

	}

}
