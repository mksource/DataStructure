package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

/*
 * Print all the nodes in the tree that don't have sibling
 */

public class Problem17 extends BinarySearchTree {

	
	private void printSingles(BinaryNode node){
		
		if(node==null)
			return;
		if(node.leftChild!=null && node.rightChild!=null){
			printSingles(node.leftChild);
			printSingles(node.rightChild);
		}
		
		else if(node.rightChild!=null){
			System.out.print(node.data+"\t");
			printSingles(node.rightChild);
		}
		else if(node.leftChild!=null){
			System.out.println(node.data+"\t");
			printSingles(node.leftChild);
		}
		
	}
	public void compute(){
		printSingles(root);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem17 p=new Problem17();
		
		p.insert(50);
		p.insert(80);
		p.insert(120);
		p.insert(55);
		p.insert(70);
		p.insert(30);
		p.insert(40);
		p.compute();
		

	}

}
