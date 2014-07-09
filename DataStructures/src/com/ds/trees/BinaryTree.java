package com.ds.trees;

import java.io.File;
import java.util.ArrayList;
import java.util.Queue;

import com.ds.utils.StdIn;

/*
 * A Sample Binary Tree created using level order traversal
 */

public class BinaryTree {
	
	protected BinaryNode root;
	private ArrayList<BinaryNode> insertarray;
	
	public BinaryNode getRoot(){
		return root;
	}

	public BinaryTree(StdIn in)
	{
		/**
		 * We are using level order traversal to insert elements
		 */
		//read the number of levels 
		int levels=in.readInt();

		int numelements=1;
		root=null;
		int elempos=0;
		insertarray=new ArrayList<BinaryNode>();

		in.readLine();
		
		for(int i=0;i<levels;i++)
		{
			String line=in.readLine();
			
			

			String elements[]=line.split(" ");


			if(elements.length!=numelements)
			{
				System.out.println("Please Insert "+numelements+" at level"+i);
				return;
			}
			for(int j=0;j<elements.length;j++)
			{
				if(!elements[j].equals("null")){
					BinaryNode newElem=new BinaryNode(Integer.parseInt(elements[j]),null,null);
					
					//Insert the node at its parent

					//Determine the number of the element

					if(elempos==0)
					{
						//The element if the root element
						root=newElem;
						insertarray.add(elempos,newElem);
					}
					else
					{
						//Determine the position of the parent
						int parent=0;
						//If the position is even the element has to be on left 
						if(elempos%2==0)
						{
							parent=(elempos-2)/2;
							BinaryNode parentElem=insertarray.get(parent);
							parentElem.rightChild=newElem;
							insertarray.add(elempos, newElem);

						}
						//If the position is odd the element has to be on right
						else
						{
							parent=(elempos-1)/2;
							BinaryNode parentElem=insertarray.get(parent);
							parentElem.leftChild=newElem;
							insertarray.add(elempos,newElem);
						}
					}


				}
				else
				{
					insertarray.add(elempos, null);
				}
				elempos++;

			}

			numelements*=2;
		}

	}

	
	public void inOrder(BinaryNode node)
	{
		if(node==null)return;
		inOrder(node.leftChild);
		System.out.print(node.data+" ");
		inOrder(node.rightChild);
	}
}
