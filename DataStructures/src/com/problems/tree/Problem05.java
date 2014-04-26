package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;

public class Problem05 extends BinarySearchTree{
	
	private int MAX_LENGTH=100;
	private int[] pathArray=new int[MAX_LENGTH];
	
	private void printLength(BinaryNode node,int pathLength){
		
		if(node==null){
			return;
		}
		pathArray[pathLength]=node.data;
		pathLength++;
		
		if(node.leftChild==null && node.rightChild==null){
			for(int i=0;i<pathLength;i++){
				System.out.print(pathArray[i]+" ");
			}
			System.out.println("");
		}
		printLength(node.leftChild,pathLength);
		printLength(node.rightChild,pathLength);
	}
	
	public void printLength(){
		printLength(root,0);		
	}
	
	public static void main(String args[]){
		
		Problem05 p=new Problem05();
		
		p.insert(10);
		p.insert(30);
		p.insert(2);
		p.insert(5);
		p.insert(4);
		
		p.printLength();
	}

}
