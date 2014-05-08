package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;

public class Problem24 extends BinarySearchTree{

	
	public void bstrange(BinaryNode node,int k1,int k2){
		
		if(node==null)
			return;
		
		if(k1<node.data)
			bstrange(node.leftChild,k1,k2);
		
		if(k1<=node.data && k2>=node.data)
			System.out.print(node.data+" ");
		
		if(k2>node.data)
			bstrange(node.rightChild, k1, k2);
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem24 p=new Problem24();
		p.insert(20);
		p.insert(22);
		p.insert(8);
		p.insert(12);
		p.insert(4);
		
		p.bstrange(p.root,10,22);
	}

}
