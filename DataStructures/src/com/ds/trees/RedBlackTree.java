package com.ds.trees;

/*
 * Properties of Red Black Tree
 * 1. Every Node is either red or Black
 * 2. The root is Black
 * 3. The nil nodes are black
 * 4. Every red node must have two black child nodes
 * 5. Every path from a given node to any of its descendant leaves must have same number of black nodes
 */

public class RedBlackTree {

	
	private RBNode root=null;
	public static int RED=0;
	public static int BLACK=1;
	
	
	
	public void insert(int element){
		
		//Insert a new Node into Red Black Tree
		//A new node will be red by default
		RBNode newNode=new RBNode();
		newNode.data=element;
		newNode.color=RED;
		
		if(root==null){
			root=newNode;
		}
		else{
			RBNode parent=root;
			RBNode current=root;
			boolean isLeft=true;
			while(current!=null){
				if(element<current.data){
					parent=current;
					current=current.left;
					isLeft=true;
				}
				else{
					parent=current;
					current=current.right;
					isLeft=false;
				}
			}
			if(isLeft)
				parent.left=newNode;
			else
				parent.right=newNode;
			
			
			//Assign the parent 
			newNode.parent=parent;
				
		}
		
		insert_case_1(newNode);
		
	}
	/*
	 * Insert Case 1: The current node is at the root of the tree
	 * we have to repaint it to black to satisfy property 2
	 */
	private void insert_case_1(RBNode node){
		
		if(node.parent==null)
			node.color=BLACK;
		else
			insert_case_2(node);
	}
	
	/*
	 * Insert Case 2:The color of the parent node is BLACK
	 * Then there is no violation any property
	 */
	private void insert_case_2(RBNode node){
		if(node.parent.color == BLACK)
			return;
		else
			insert_case_3(node);
	}
	
	/*
	 * Insert Case 3:If the parent and uncle are red
	 * then both of them can be painted black and the grandparent is painted RED
	 * 
	 * Then if the grandparent violates any property then we have to start from case 1
	 * 
	 */
	private void insert_case_3(RBNode node){
		
		RBNode U=uncle(node);
		RBNode G=grandparent(node);
		RBNode P=node.parent;
		
		if(U!=null && U.color==RED){
			
			P.color=BLACK;
			U.color=BLACK;
			G.color=RED;
			insert_case_1(G);
		}
		else
			insert_case_4(node);
		
	}
	
	/*
	 * Insert Case 4
	 * 
	 * Parent is Red But uncle is Black 
	 * 
	 * If P is the left child of the GrandParent G and N is the right child of P 
	 * then we have to do left rotation
	 * If P is the right child of the GrandParent G and N is the left child of P
	 * then we have to do right rotation
	 */
	private void insert_case_4(RBNode node){
		
		RBNode G=grandparent(node);
		RBNode P=node.parent;
		
		if(P == G.left && node == P.right){
			
		
			
		}
		else if(P == G.right && node == P.left){
			
		}
		insert_case_5(node);
	}
	
	/*
	 * Insert Case 5
	 */
	private void insert_case_5(RBNode node){
		
	}
	
	/*
	 * rotate left
	 */
	private void rotateLeft(RBNode k1){
		
		RBNode k2=k1.right;
		RBNode k1parent=k1.parent;
	    RBNode k2parent=k2.parent;
	    
	}
	
	/*
	 * rotate right
	 */
	private void rotateRight(RBNode k1){
		
	}
	

	//Helper Method to return the grandparent of a node
	private RBNode grandparent(RBNode node){
		
		if(node!=null && node.parent.parent!=null)
			return node.parent.parent;
		else
			return null;
		
	}
	
	//Helper Method to return the uncle of a node
	private RBNode uncle(RBNode node){
		
		RBNode grandparent=grandparent(node);
		if(grandparent==null)
			return null;
		if(grandparent.left==node.parent)
			return grandparent.right;
		else
			return grandparent.left;
		
	}
}
