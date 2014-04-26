package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

public class Problem08 extends BinarySearchTree {

	
	private BinaryNode prev=null;
	BinaryNode head = null;
	
	private void convertToDll(BinaryNode node){
		
		   if(node==null)
			   return;
		   
		   convertToDll(node.leftChild);
		   
		   if(prev==null)
			   head=node;
		   else{
			   prev.rightChild=node;
			   node.leftChild=prev;
		   }
		   prev=node;
		   convertToDll(node.rightChild);
	}
	
	
	
	public void compute(){
		
		convertToDll(root);
		while(head.rightChild!=null){
			System.out.print(head.data+"\t");
			head=head.rightChild;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem08 p=new Problem08();
		
		p.insert(35);
		p.insert(45);
		p.insert(37);
		p.insert(12);
		p.insert(30);
		p.insert(8);
		
		p.compute();

	}

}
