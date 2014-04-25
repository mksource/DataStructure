package com.problems.tree;

import com.ds.trees.BinarySearchTree;
import com.ds.trees.BinaryNode;
import java.util.LinkedList;
import java.util.Deque;

public class Problem01 extends BinarySearchTree{

	
	private static String INORDER="inorder";
	private static String PREORDER="preorder";
	private static String POSTORDER="postorder";
	private static String LEVELORDER="levelorder";
	
	
	public void traverse(String type){
		
		if(type.equals(INORDER)){
			inorder(root);
		}
		else if(type.equals(PREORDER)){
			preorder(root);
		}
		else if(type.equals(POSTORDER)){
			postorder(root);
		}
		else if(type.equals(LEVELORDER)){
			levelorder();
		}
	}
	
	
	/*Inorder traversal of Binary Search Tree*/
	private void inorder(BinaryNode node){
		if(node!=null){
			inorder(node.leftChild);
			System.out.print(node.data+"\t");
			inorder(node.rightChild);
		}
	}
	
	
	/*Preorder traversal of Binary Search Tree*/
	private void preorder(BinaryNode node){
		if(node!=null){
			System.out.print(node.data+"\t");
			preorder(node.leftChild);
			preorder(node.rightChild);
		}
	}
	
	/*Postorder traversal of Binary Search Tree*/
	private void postorder(BinaryNode node){
		if(node!=null){
			postorder(node.leftChild);
			postorder(node.rightChild);
			System.out.print(node.data+"\t");
		}
	}
	
	/*Level order traversal of Binary Search Tree*/
	private void levelorder(){
		
		Deque<BinaryNode> q=new LinkedList<BinaryNode>();
		q.add(root);
		while(!q.isEmpty()){
			
			BinaryNode node=q.remove();
			int element=node.data;
			System.out.print(element+"\t");
			if(node.leftChild!=null)
				q.add(node.leftChild);
			if(node.rightChild!=null)
				q.add(node.rightChild);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Problem01 tree=new Problem01();
		
		tree.insert(70);
		tree.insert(45);
		tree.insert(56);
		tree.insert(90);
		tree.insert(120);
		tree.insert(67);
		tree.insert(135);
		tree.insert(100);
		tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(34);
        tree.insert(80);
        
        System.out.println("Inorder traversal: ");
        tree.traverse(INORDER);
        System.out.println("\nPreorder traversal");
        tree.traverse(PREORDER);
        System.out.println("\nPostorder traversal");
        tree.traverse(POSTORDER);
        System.out.println("\nLevel traversal");
        tree.traverse(LEVELORDER);
	}

}
