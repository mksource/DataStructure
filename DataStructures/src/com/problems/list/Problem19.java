package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem19 extends SingleLinkedList{

	
	
	private void printReverse(SLNode head){
		
		if(head==null)
			return;
		
			printReverse(head.next);
			System.out.print(head.data+" ");
			
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem19 p=new Problem19();
		
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		p.printList();
		System.out.println("\nThe Reverse of list");
		p.printReverse(p.Head);
		
	}

}
