package com.problems.tree;
/*
 * Printing the tree in vertical order
 */
import java.util.ArrayList;
import java.util.HashMap;


import com.ds.trees.BinaryNode;
import com.ds.trees.BinarySearchTree;

public class Problem14 extends BinarySearchTree{

	private HashMap<Integer,ArrayList<Integer>> list=new HashMap<Integer,ArrayList<Integer>>();
	
	private void verticalorder(BinaryNode node,int hd){
		if(node==null)
			return;
		else
		{
			verticalorder(node.leftChild,hd-1);
			int data=node.data;
			if(!list.containsKey(hd)){
				list.put(hd,new ArrayList<Integer>());
			}
			ArrayList<Integer> elems=list.get(hd);
			elems.add(data);
			list.put(hd,elems);
			verticalorder(node.rightChild,hd+1);
		}
		
	}
	public void compute(){
		verticalorder(root,0);
		
		for(Integer key:list.keySet()){
			ArrayList<Integer> elems=list.get(key);
			int n=elems.size();
			for(int i=0;i<n;i++){
				System.out.print(elems.get(i)+"\t");
			}
			System.out.println("");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Problem14 p=new Problem14();
           
           p.insert(80);
           p.insert(60);
           p.insert(40);
           p.insert(65);
           p.insert(120);
           p.insert(135);
           p.insert(90);
           p.compute();
	}

}
