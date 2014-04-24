package com.ds.trees;

import com.ds.utils.UnderflowException;

public class AvlTree {
	
	private AvlNode root;
	private static int ALLOWED_IMBALANCE=1;
	
	public AvlTree(){
		root=null;
	}
	public void insert(int elem){
		root=insert(elem,root);
	}
	public void remove(int elem){
		root=remove(elem,root);
	}
	public boolean isEmpty(){
		return root==null;
	}
	public void makeEmpty(){
		root=null;
	}
	public int findMax(){
		if(isEmpty())
			throw new UnderflowException("AVL tree is empty");
		return findMax(root).data;
	}
	public int findMin(){
		if(isEmpty())
			throw new UnderflowException("AVL tree is empty");
		return findMin(root).data;
	}
	
	private AvlNode findMin(AvlNode node){
		if(node==null)
			return null;
		else if(node.left==null)
			return node;
		return findMin(node.left);
		
	}
	private AvlNode findMax(AvlNode node){
		if(node==null)
			return null;
		else if(node.right==null)
			return node;
		return findMax(node.right);
	}
	private AvlNode insert(int element,AvlNode node){
		
		if(node==null)
			return new AvlNode(element,null,null);
		if(element<node.data)
			node.left=insert(element,node.left);
		else if(element>node.data)
			node.right=insert(element,node.right);
		else
			;
		return balance(node);
	}
	private AvlNode remove(int elem,AvlNode node){
		
		if(node == null)
			return node;
		if(elem < node.data)
			node.left=remove(elem,node.left);
		else if(elem >node.data)
			node.right=remove(elem,node.right);
		else if(node.left!=null && node.right!=null){
			node.data=findMin(node.right).data;
			node.right=remove(node.data,node.right);
		}
		else
			node=(node.left!=null)?node.left:node.right;
		return balance(node);
			
	}
	
	private AvlNode balance(AvlNode t){
		
		if(t==null)
			return t;
		
		if(height(t.left)-height(t.right)>ALLOWED_IMBALANCE){
			if(height(t.left.left)>=height(t.left.right))
				t=rotateWithLeftChild(t);
			else
				t=doubleWithLeftChild(t);
		}
		else if(height(t.right)-height(t.left)>ALLOWED_IMBALANCE){
			if(height(t.right.right)>=height(t.right.left))
				t=rotateWithRightChild(t);
			else
				t=doubleWithRightChild(t);
		}
				
		t.height=Math.max(height(t.left),height(t.right))+1;
		return t;
	}
	
	//T1,T2,T3 and T4 are subtrees
	/**
	 * Rotate with Left Left Case
	 *                   Right Rotate(z)
	 *              z                          y
	 *            /   \                      /   \   
	 *           y    T4                    x     z
	 *          / \                        / \   / \
	 *         x   T3                     T1  T2 T3 T4
	 *        / \
	 *       T1  T2
	 */
	private AvlNode rotateWithLeftChild(AvlNode z){
		
		AvlNode y=z.left;
		z.left=y.right;
		y.right=z;
		z.height=Math.max(height(z.left),height(z.right))+1;
	    y.height=Math.max(height(y.left),height(y.left))+1;			
		return y;
	}
	
	/**
	 * Rotate with Left Right Case
	 *                   Left Rotate(y)       Right Rotate(z) 
	 *            z                   z                    x
	 *           / \                 / \                  / \ 
	 *          y   T4              x   T4               y   z 
	 *         / \                 / \                  / \ / \
	 *        T1  x               y   T3               T1 T2T3 T4   
	 *           / \             / \
	 *          T2  T3          T1  T2
	 * 
	 */
	private AvlNode doubleWithLeftChild(AvlNode z){
		z.left=rotateWithRightChild(z.left);
		return rotateWithLeftChild(z);
	}
	
	/**
	 * Rotate with Right Right Case
	 *          z          Left Rotate(z)           y
	 *         / \                                /   \
	 *        T1  y                              z     x
	 *           / \                            / \   / \ 
	 *          T2  x                          T1  T2 T3 T4
	 *             / \
	 *            T3  T4 
	 *        
	 *        
	 */
	private AvlNode rotateWithRightChild(AvlNode z){
		AvlNode y=z.right;
		z.right=y.left;
		y.left=z;
		y.height=Math.max(height(y.left),height(y.right))+1;
		z.height=Math.max(height(z.left),height(z.right))+1;
		return y;
	}
	
	/**
	 * Rotate with Right Left case
	 * 
	 *            z       Right Rotate(x)      z       Left Rotate(z)       x
	 *           / \                          / \                          / \  
	 *          T1  y                        T1  x                        z   y
	 *             / \                          /  \                     / \ / \
	 *            x   T4                       T2   y                   T1 T2T3 T4 
	 *           / \                               / \
	 *          T2  T3                             T3 T4
	 */
	 private AvlNode doubleWithRightChild(AvlNode z){
		 z.right=rotateWithRightChild(z.right);
		 return rotateWithLeftChild(z);
	 }
	
	
	private int height(AvlNode t){
		return t==null?-1:t.height;
	}
	
	
	
	
	
	

}
