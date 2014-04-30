package com.problems.list;

import com.ds.list.DoublyLinkedList;
import com.ds.list.DLNode;

public class Problem28 extends DoublyLinkedList{

	
	private void delNode(int element){
		
		DLNode cur=HEADER.next;
		DLNode prev=HEADER;
		while(cur.next!=TAILER){
			
			if(cur.data==element){
				prev.next=cur.next;
				cur.next.prev=prev;
				break;
			}
			prev=cur;
			cur=cur.next;
		}
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem28 dlist=new Problem28();
		
		dlist.insertAtEnd(10);
		dlist.insertAtEnd(20);
		dlist.insertAtEnd(30);
		dlist.insertAtEnd(40);
		dlist.insertAtEnd(50);
		dlist.insertAtEnd(60);
		dlist.insertAtEnd(70);
		dlist.insertAtEnd(80);
		
		dlist.printList();
		System.out.println();
		dlist.delNode(40);
		dlist.printList();
		
	}

}
