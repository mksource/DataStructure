package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

public class Problem06 extends BinarySearchTree{
	
	
	public void compute(){
		mirror(root);
	}
	private void mirror(BinaryNode node){
		if(node==null){
			return;
		}
		else{
			BinaryNode temp;
			
			mirror(node.leftChild);
			mirror(node.rightChild);
			
			temp=node.leftChild;
			node.leftChild=node.rightChild;
			node.rightChild=temp;
		}
	}
	public static void main(String args[]){
		
		Problem06 p=new Problem06();
		
		p.insert(50);
		p.insert(30);
		p.insert(20);
		p.insert(40);
		p.insert(70);
		
		p.displayTree();
		p.compute();
		p.displayTree();
	}

}
