package com.problems.tree;

public class Problem29 {

	private class Node{
		int  data;
		Node left;
		Node right;
		Node foo;
	}
	
	public void printBfs(Node root){
		
		//First We have to connect all the siblings
		if(root==null)
			return;
		
		root.foo=null;
		
		//Link the Siblings
		linkSibling(root);
		
		for(Node p=root;p!=null;){
			printSiblings(p);
			if(p.left!=null)p=p.left;
			else if(p.right!=null)p=p.right;
			else p=findFirstNephew(p);
		}
					
		
	}
	public void printSiblings(Node p){
		for(;p!=null;p=p.foo)System.out.print(p.data+" ");
		System.out.println();
	}
	public void linkSibling(Node n){
		
		if(n.left!=null && n.right!=null){
			
			n.left.foo=n.right;
			n.right.foo=findFirstNephew(n.left);
			
			//First link the right part so that we get the right part
			linkSibling(n.right);
			linkSibling(n.left);
		}
		else if(n.left!=null){
			n.left.foo=findFirstNephew(n);
			linkSibling(n.left);
		}
		else if(n.right!=null){
			n.right.foo=findFirstNephew(n);
			linkSibling(n.right);
		}
		
	}
	public Node findFirstNephew(Node p){
		
		for(Node sibling=p.foo;sibling!=null;sibling=sibling.foo){
			if(sibling.left!=null)return sibling.left;
			if(sibling.right!=null)return sibling.right;
		}
		return null;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
