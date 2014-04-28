package com.ds.list;

public class TestCLList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkedList list=new CircularLinkedList();
		
		
		list.insertAtBack(10);
		list.insertAtBack(20);
		list.insertAtBack(30);
		list.insertAtBack(40);
		list.displayList();
		System.out.println(" ");
		
		list.insertAtFront(50);
		list.insertAtFront(60);
		list.insertAtFront(70);
		list.insertAtFront(80);
		list.displayList();
		System.out.println(" ");
		
		list.removeAtBack();
		list.displayList();
		System.out.println(" ");
		
		list.removeAtFront();
		list.displayList();
	}

}
