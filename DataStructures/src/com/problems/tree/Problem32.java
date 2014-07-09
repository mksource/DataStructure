package com.problems.tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.trees.BinaryNode;
import com.ds.trees.BinaryTree;
import com.ds.utils.StdIn;

/*Find the maximum sum leaf to root path*/

public class Problem32 extends BinaryTree{

	
	private BinaryNode targetNode;
	private int max_sum=Integer.MIN_VALUE;
	
	public Problem32(StdIn in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	private void findTarget(BinaryNode node,int currSum){
		
		if(node==null)
			return;
		
		currSum=currSum+node.data;
		
		//If it is a leaf then update the maximum sum
		if(node.leftChild==null && node.rightChild==null){
			
			if(currSum > max_sum){
				max_sum=currSum;
				targetNode=node;
			}
		}
		
		findTarget(node.leftChild,currSum);
		findTarget(node.rightChild,currSum);
		
	}
	private boolean printMaxPath(BinaryNode node){
		
		if(node==null)
			return false;;
		
		if(node==targetNode || printMaxPath(node.leftChild) || printMaxPath(node.rightChild)){
			
			System.out.print(node.data+" ");
			return true;
		}
		return false;
	}
	
	public void solve(){
		
		//Find the largest path from leaf to the root
		findTarget(root,0);
		
		System.out.println("The target node is "+targetNode.data);
		System.out.println("The maximum sum from root to leaf "+max_sum);
		
		System.out.println("Printing the maximum sum path ");
		printMaxPath(root);
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdIn in=new StdIn();
		try {
			in.setScanner(new Scanner(new File("text/tree2.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Problem32 p=new Problem32(in);
		p.solve();
	}

}
