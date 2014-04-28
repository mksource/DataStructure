package com.ds.list;

public class TestDLList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList list=new DoublyLinkedList();
		
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.printList();
		System.out.println("");
		
		list.insertAtFront(50);
		list.insertAtFront(60);
		list.insertAtEnd(70);
		list.printList();
		System.out.println("");
		
		list.removeAtEnd();
		list.removeAtEnd();
		list.printList();
		System.out.println("");
		
		list.removeAtFront();
		list.removeAtFront();
		list.printList();
		System.out.println("");
		
	}

}
