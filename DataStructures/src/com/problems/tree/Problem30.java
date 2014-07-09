package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Step 1: Traverse the given tree inorder traversal and store all the nodes in the auxillary array
 * 
 * Step 2: Reverse the auxillary array
 * 
 * Step 3: Traverse again the tree inorder and replace elements from elements in auxillary array
 */

public class Problem30 extends BinaryTree{

	public Problem30(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	private int elements[]=new int[100];
	private int nelems;
	
	public void storeInorder(BinaryNode node,int level){
		
		if(node==null)
			return;
		int nextLevel=level+1;
		storeInorder(node.leftChild,nextLevel);
		//Check if it odd level then add the element to the array
		if(level%2!=0)
			elements[nelems++]=node.data;
		storeInorder(node.rightChild,nextLevel);
	}
	
	public void reverseInorder(BinaryNode node,int level){
		
		if(node==null)
			return;
		int nextLevel=level+1;
		reverseInorder(node.leftChild,nextLevel);
		if(level%2!=0)
			node.data=elements[nelems++];
		reverseInorder(node.rightChild,nextLevel);
	}
	
	public void solve(){
		
		storeInorder(root,0);
		
		System.out.println("Listing the elements in odd level array");
		for(int i=0;i<nelems;i++)
			System.out.print(elements[i]+" ");
		
		System.out.println("\nReversing the elements in odd level array");
		int i=0;
		int j=nelems-1;
		while(i<j && i!=j){
			int elem1=elements[i];
			elements[i]=elements[j];
			elements[j]=elem1;
			i++;
			j--;
		}	
		
		System.out.println("\nListing the elements in odd level array");
		for(int k=0;k<nelems;k++)
			System.out.print(elements[k]+" ");
		
		//Reinitialize the array
		nelems=0;
		reverseInorder(root,0);
		
		System.out.println("Inorder Traversal");
		//Print the tree
		inOrder(root);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdIn in=new StdIn();
		try {
			in.setScanner(new Scanner(new File("text/tree1.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		Problem30 p=new Problem30(in);
		p.solve();

	}

}
