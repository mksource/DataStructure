package com.problems.tree;

import com.ds.trees.BinaryNode;
/*
 * To find the diameter of the tree
 */

public class Problem13 {

	private int max(int a,int b){
		return (a>b)?a:b;
	}
	
	private int height(BinaryNode node){
		
		if(node==null)
			return 0;
		else
			return 1+max(height(node.leftChild),height(node.rightChild));
	}
	public int diameter(BinaryNode node){
		
		if(node==null)
			return 0;
		else{
			
			//Get the height of the left subtree
			int lheight=height(node.leftChild);
			
			//Get the height of the right subtree
			int rheight=height(node.rightChild);
			
			//Diameter of the left subtree
			int ldiameter=diameter(node.leftChild);
			
			//Diameter of the right subtree
			int rdiameter=diameter(node.rightChild);
			
			//Return maximum of left diameter and right diameter and left height+right height+1
			return max(lheight+rheight+1,max(ldiameter,rdiameter));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
