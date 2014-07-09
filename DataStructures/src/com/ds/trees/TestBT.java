package com.ds.trees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.ds.utils.StdIn;



public class TestBT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StdIn in=new StdIn();
		try{
			in.setScanner(new Scanner(new File("text/tree1.txt")));
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		BinaryTree tree=new BinaryTree(in);
		tree.inOrder(tree.getRoot());
	}

}
