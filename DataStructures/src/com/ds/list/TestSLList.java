package com.ds.list;

public class TestSLList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList list=new SingleLinkedList();
		
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtFront(40);
		list.insertAtFront(50);
		list.insertAtFront(60);
		list.printList();
		
		list.removeAtEnd();
		list.removeAtEnd();
		
		System.out.println("");
		list.printList();
		
		list.removeAtFront();
		list.removeAtFront();
		
		System.out.println("");
		list.printList();

	}

}
