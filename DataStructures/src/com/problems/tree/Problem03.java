package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;

/*
 * To find out whether trees are identical
 */

public class Problem03 extends BinarySearchTree{

	
	public boolean isIdentical(Problem03 tree2){
		return isIdentical(this.root,tree2.root);
	}
	
	
	private boolean isIdentical(BinaryNode t1,BinaryNode t2){
		
		if(t1 == null && t2 == null)
			return true;
		else if(t1!=null && t2!=null)
			return t1.data == t2.data &&  isIdentical(t1.leftChild,t2.leftChild) && isIdentical(t1.rightChild,t2.rightChild);
		else
			return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem03 tree1=new Problem03();
		tree1.insert(60);
		tree1.insert(80);
		tree1.insert(70);
		tree1.insert(90);
		tree1.insert(40);
		tree1.insert(50);
		tree1.insert(30);
		
		Problem03 tree2=new Problem03();
		tree2.insert(60);
		tree2.insert(80);
		tree2.insert(70);
		tree2.insert(90);
		tree2.insert(40);
		tree2.insert(50);
		tree2.insert(30);
		
		Problem03 tree3=new Problem03();
		tree3.insert(60);
		tree3.insert(80);
		tree3.insert(70);
		tree3.insert(95);
		tree3.insert(40);
		tree3.insert(50);
		tree3.insert(30);
		
		System.out.println("Are trees tree1 and tree2 identical "+tree1.isIdentical(tree2));
		System.out.println("Are trees tree1 and tree3 identical "+tree1.isIdentical(tree3));
		

	}

}
