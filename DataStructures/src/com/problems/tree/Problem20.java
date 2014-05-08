package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;

/*
 * Morris Traversal
 */

public class Problem20 extends BinarySearchTree{

	
	public void morrisInorder(){
		
		BinaryNode current=root;
		
		while(current!=null){
			
			//If the left subtree is null print the data and move on to 
			//right subtree
			if(current.leftChild==null){
				System.out.print(current.data+" ");
				current=current.rightChild;
			}
			else{
			//Find the inorder predecessor of the current node
			//It is the rightmost node in the left subtree of the current node
			BinaryNode pre=current.leftChild;
			while(pre.rightChild!=null && pre.rightChild!=current)
				pre=pre.rightChild;
			
			if(pre.rightChild==null){
				pre.rightChild=current;
				current=current.leftChild;
			}
			else{
				pre.rightChild=null;
				System.out.print(current.data+" ");
				current=current.rightChild;
			}
			}
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem20 p=new Problem20();
		
		p.insert(60);
		p.insert(50);
		p.insert(40);
		p.insert(80);
		p.insert(70);
		p.insert(100);
		p.insert(30);
		p.insert(55);
		p.insert(53);
		
		p.displayTree();
		System.out.println("Morris Order Traversal");
		p.morrisInorder();
	}

}
