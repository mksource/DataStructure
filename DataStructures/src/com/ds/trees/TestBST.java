package com.ds.trees;

public class TestBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree=new BinarySearchTree();
		
		tree.insert(60);
		tree.insert(50);
		tree.insert(15);
		tree.insert(25);
		tree.insert(56);
		tree.insert(89);
		tree.insert(78);
		tree.insert(65);
		
		System.out.println("Tree Created");
		tree.printTree();
		System.out.println("\n");
		System.out.println("The minimum element in the tree "+tree.findMin());
		System.out.println("The maximum element in the tree "+tree.findMax());
		System.out.println("Does the Tree contain element 17"+tree.contains(17));
		System.out.println("Does the Tree contain element 78 "+tree.contains(78));
        System.out.println("Removing element 56 from tree ");
        tree.remove(56);
        tree.displayTree();
	}

}
