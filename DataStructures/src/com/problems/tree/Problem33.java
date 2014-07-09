package com.problems.tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

/*
 * Transform a Binary Search Tree into a Greater Sum Tree That is for each node
 * replace the node data with values greater than this node
 * 
 * Traverse the tree in reverse inorder traversal
 */

public class Problem33 extends BinaryTree{

	private int sum=0;
	public Problem33(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	


	public void greaterSumTree(BinaryNode node){
		
		if(node == null)
			return;
		greaterSumTree(node.rightChild);
		sum=sum+node.data;
		node.data=sum-node.data;
		greaterSumTree(node.leftChild);
		
	}
	
	
	
	public void solve(){
		
		
		inOrder(root);
		
		greaterSumTree(root);
		
		inOrder(root);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdIn in=new StdIn();
		try {
			in.setScanner(new Scanner(new File("text/tree33.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Problem33 p=new Problem33(in);
		p.solve();
		
	}

}
