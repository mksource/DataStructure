package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

/*
 * To  find if Root to leaf Path sum is equivalent to given number
 */

public class Problem10 extends BinarySearchTree{

	
	private  boolean hasPathSum(BinaryNode node,int sum){
		if(node==null){
			return (sum==0);
		}
		else{
			int subsum=sum-node.data;
			boolean ans=false;
			
			if(sum==0 && node.leftChild==null && node.rightChild==null)
				return true;
			if(node.leftChild!=null)
				ans=ans||hasPathSum(node.leftChild,subsum);
			if(node.rightChild!=null)
				ans=ans||hasPathSum(node.rightChild, subsum);
			
			return ans;
		}
	}
	public void compute(int number){
		System.out.println("Has the tree consist of sum Path "+hasPathSum(root,number));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem10 p=new Problem10();
		
		p.insert(50);
		p.insert(60);
		p.insert(40);
		p.insert(45);
		p.insert(70);
		p.compute(95);
	}

}
