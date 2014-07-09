package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
/*
 * Find the Distance between two nodes 
 * The Distance between two nodes is the number of edges we have to traverse
 * from one node to another
 * 
 * The distance between two nodes in 
 * dist(d1,d2)=dist(root,d1)+dist(root,d2)-2*dist(root,lca)
 */
import com.ds.utils.StdIn;

public class Problem34 extends BinaryTree{

	
	public Problem34(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}


	//The level of the first node
	int d1=-1;
	
	//The level of the second node
	int d2=-1;
	
	//The distance between two nodes
	int dist=-1;
	
	//the node holding the first node
	BinaryNode leftNode;
	
	//the node holding the second node
	BinaryNode rightNode;
	
	public BinaryNode findDistance(BinaryNode node,int n1,int n2,int level){
		
		if(node==null)
			return null;
		//If the first node is found then store its level and return the node
		if(node.data == n1){
			d1=level;
		}
		//If the second node is found then store its level and return the node
		if(node.data == n2){
			d2=level;
		}
		
		
				
		//If the data is not found then find the node either in the left subtree or right subtree
		leftNode=findDistance(node.leftChild,n1,n2,level+1);
		rightNode=findDistance(node.rightChild,n1,n2,level+1);
		
		//If both the left and right child is not null then they are found in leftsutree and in right subtree
		if(leftNode != null && rightNode !=null){
			dist=d1+d2-2*level;
			return node;
		}
		
		
		return (leftNode!=null)?leftNode:rightNode;
		
		
	}
	private int findLevel(BinaryNode node,int key,int level){
		
		if(node==null)
			return -1;
		
		if(node.data==key)
			return level;
		
		int l=findLevel(node.leftChild,key,level+1);
		return (l!=-1)?l:findLevel(node.rightChild,key,level+1);
	}
	public int solve(int n1,int n2){
		
		//Find the distance between the two nodes
		BinaryNode lca=findDistance(root,n1,n2,1);
		
		if(d1!=-1 && d2!=-1)
			return dist;
		
		//if n1 is the ancestor of n2
		if(d1!=-1){
			dist=findLevel(lca,n2,0);
			return dist;
		}   
		
		//If n2 is the ancestor of n1 	
		if(d2!=-1){
			dist=findLevel(lca,n1,0);
			return dist;
		}
		
		//If n1 and n2 is not found then return -1
		return -1;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
