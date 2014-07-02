package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

public class Problem23 extends BinarySearchTree{

	
	public void convertSum(BinaryNode node){
		
		if(node==null || (node.leftChild==null && node.rightChild==null))
			return;
		else{
			
			//Convert the left subtree to hold the sum property
			convertSum(node.leftChild);
			
			//Convert the right subtree to hold the sum property
			convertSum(node.rightChild);
			
			int left_data=0;
			int right_data=0;
			
			if(node.leftChild!=null)
				left_data=node.leftChild.data;
			
			if(node.rightChild!=null)
				right_data=node.rightChild.data;
			
			int diff=(left_data+right_data)-node.data;
			
			if(diff>0)
				node.data=node.data+diff;
			
			else
				increement(node,-diff);
		}
	}
	private void increement(BinaryNode node,int diff){
		
		//If the left child is not null
		//then increment left child otherwise right child
		if(node.leftChild!=null){
			
			node.leftChild.data=node.leftChild.data+diff;
			increement(node.leftChild,diff);
		}
		else if(node.rightChild!=null){
			node.rightChild.data=node.rightChild.data+diff;
			increement(node.rightChild,diff);
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
