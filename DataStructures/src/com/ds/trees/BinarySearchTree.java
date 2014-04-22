package com.ds.trees;

import com.ds.utils.UnderflowException;

public class BinarySearchTree {
	
	
	protected BinaryNode root;
	
	/**
	 * Constructs a tree
	 */
	public BinarySearchTree(){
		root=null;
	}
	
	/*
	 * Inserts an element into tree
	 */
    public void insert(int element){
    	root=insert(element,root);
    }
    
    /*
     * Remove an element from tree
     */
    public void remove(int element){
    	root=remove(element,root);
    }
    
    /*
     * Find the minimum element in the binary search tree
     */
    public int findMin(){
    	
    	if(isEmpty())
    		throw new UnderflowException("Tree is empty");
    	return findMin(root).data;
    }
    
    /*
     * Find the maximum element in the binary search tree
     */
    public int findMax(){
    	if(isEmpty())
    		throw new UnderflowException("Tree is empty");
    	return findMax(root).data;
    }
    
    /*
     * Find out whether the element is found in the tree
     */
    public boolean contains(int element){
    	return contains(element,root);
    }
    
    /*
     * Prints the Tree in sorted order 
     */
    public void printTree(){
    	if(isEmpty())
    		System.out.println("The Tree is empty");
    	else
    		printTree(root);
    }
    
    /*
     * Test if the tree is empty
     */
    public boolean isEmpty(){
    	return root==null;
    }
    
    /*
     * Makes the tree logically empty
     */
    public void makeEmpty(){
    	root=null;
    }
    
    /*
     * Internal method to insert a new element into the tree
     */
    private BinaryNode insert(int element,BinaryNode node)
    {
    	if(node==null)
    		return new BinaryNode(element,null,null);
    	
    	if(element < node.data)
    		  node.leftChild=insert(element,node.leftChild);
    	else if(element > node.data)
    		  node.rightChild=insert(element,node.rightChild);
    	else
    		;  //Do nothing
    	return node;
    	
    }
    
    /**
     * Internal method to smallest element in the Binary Search tree
     */
    private BinaryNode findMin(BinaryNode node){
    	if(node==null)
    		return null;
    	else if(node.leftChild==null)
    		return node;
    	return findMin(node.leftChild);
    }
    
    /*
     * Internal method to find out largest method in Binary Search Tree
     */
    private BinaryNode findMax(BinaryNode node){
    	if(node==null)
    		return null;
    	else if(node.rightChild==null)
    		return node;
    	return findMax(node.rightChild);
    }
    
    /*
     * Internal method to find out whether the tree contains the item
     */
    private boolean contains(int element,BinaryNode node)
    {
    	if(node == null)
    		return false;
    	
    	if(element < node.data)
    		return contains(element,node.leftChild);
    	else if(element > node.data)
    		return contains(element,node.rightChild);
    	else
    		return true;
    		
    }
    /*
     * Internal method to print the tree in sorted order
     */
    private void printTree(BinaryNode node){
    	
    	if(node!=null){
    		printTree(node.leftChild);
    		System.out.print(node.data+" \t");
    		printTree(node.rightChild);
    	}
    }
    
    /*
     * Internal method to remove an element from the tree
     */
    private BinaryNode remove(int element,BinaryNode node){
    	
    	if(node==null)
    		return node;
    	
    	if(element < node.data)
    		node.leftChild=remove(element,node.leftChild);
    	else if(element > node.data)
    		node.rightChild=remove(element,node.rightChild);
    	else if(node.leftChild!=null && node.rightChild!=null){
    		node.data=findMin(node.rightChild).data;
    		node.rightChild=remove(node.data,node.rightChild);
    	}
    	else
    		node=(node.leftChild!=null)?node.leftChild:node.rightChild;
    	return node;	
    }
}
