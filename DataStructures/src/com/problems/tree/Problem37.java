package com.problems.tree;

import com.ds.trees.*;
import com.ds.utils.StdIn;

public class Problem37 extends BinaryTree{

	public Problem37(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public boolean findElement(BinaryNode root,int element){
		
		if(root==null)
			return false;
		else{
			if(root.data == element)
				return true;
			else{
				boolean temp=findElement(root.leftChild,element);
				if(temp)
					return true;
				else
					return findElement(root.rightChild,element);
			}
		}
	}

}
