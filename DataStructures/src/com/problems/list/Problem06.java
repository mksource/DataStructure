package com.problems.list;

import com.ds.list.DoublyLinkedList;
import com.ds.list.DLNode;

public class Problem06 extends DoublyLinkedList{

	private DLNode reverseDlist(){
		
		DLNode cur=HEADER.next;
		DLNode prev=TAILER;
		DLNode next=TAILER;
		
		while(cur!=TAILER){
			next=cur.next;
			cur.next=prev;
			prev.prev=cur;
			prev=cur;
			cur=next;
		}
		
		prev.prev=HEADER;
		HEADER.next=prev;
		
		return prev;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem06 p=new Problem06();
		
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		p.insertAtEnd(70);
		
		p.printList();
		
		System.out.println("After reversing the list");
		p.reverseDlist();
		p.printList();
		
		
	}

}
