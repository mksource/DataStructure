package com.ds.trees;

public class AvlNode {
	
	public int data;
	public AvlNode left;
	public AvlNode right;
	public int height;
	
	public AvlNode(int element){
		
	}
	public AvlNode(int element,AvlNode left,AvlNode right){
		this.data=element;
		this.left=left;
		this.right=right;
	}

}
