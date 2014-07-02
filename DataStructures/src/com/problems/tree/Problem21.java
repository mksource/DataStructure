package com.problems.tree;

import java.util.Stack;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

public class Problem21 extends BinarySearchTree{

	
public void inorderWithStack(){
		
		Stack<BinaryNode> stack=new Stack<BinaryNode>();
		
		BinaryNode current=root;
		
		
		while(true){
			
			while(current!=null){
				stack.push(current);
				current=current.leftChild;
			}
			
			
			if(stack.isEmpty())
				break;
			
			BinaryNode node=stack.pop();
			System.out.print(node.data+" ");
			current=node.rightChild;
			
			
			
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem21 p=new Problem21();
		p.insert(60);
		p.insert(50);
		p.insert(40);
		p.insert(80);
		p.insert(70);
		p.insert(100);
		p.insert(30);
		p.insert(55);
		p.insert(53);
		p.displayTree();
		
		//p.displayTree();
		p.inorderWithStack();
	}

}
