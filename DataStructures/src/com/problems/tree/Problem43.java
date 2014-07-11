package com.problems.tree;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

public class Problem43 extends BinaryTree{

	public Problem43(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	int MAX=100;
	int pathArray[]=new int[MAX];
	
	
	
	public void findPath(BinaryNode root,int pathArray[],int pathLength,int sum){
		
		if(root==null)
			return;
		else{
			if(sum == 0){
				for(int i=0;i<pathLength;i++)
					System.out.print(pathArray[i]+" ");
			}
			else
				pathArray[pathLength++]=root.data;
			findPath(root.leftChild,pathArray,pathLength,sum);
			findPath(root.rightChild,pathArray,pathLength,sum);
				
		}
		
	}
	

}
