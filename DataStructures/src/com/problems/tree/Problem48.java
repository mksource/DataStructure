package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem48 extends BinaryTree{

	public Problem48(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	private int preIndex=0;
	
	//Return the index for an element in the inorder using linear search
	private int Search(int inorder[],int element,int start,int end){
		
		for(int i=start;i<end;i++)
			if(element == inorder[i])
				return i;
		
		return -1;
		
	}
	
	//Method to build the binary tree if the inorder and preorder is given
	public BinaryNode buildTree(int inorder[],int preorder[],int start,int end){
		
		
		//Base Case 
		if(start > end)
			return null;
		
		
		//Form a new node
		BinaryNode node=new BinaryNode(preorder[preIndex],null,null);
		
		//Increement the preIndex
		preIndex++;
		
		//If the node has no children then return
		if(start == end)
			return node;
		
		//Search for the element in the inorder index
		int inIndex=Search(inorder,node.data,start,end);
		
		//Build the left subtree
		node.leftChild=buildTree(inorder,preorder,start,inIndex-1);
		
		//Build the right subtree
		node.rightChild=buildTree(inorder,preorder,inIndex+1,end);
		
		//return the node
		return node;
		
	}

}
