package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem22 extends SingleLinkedList{
	
	
	private void pairwiseLinkSwap(SLNode head){
		
		//if the list is empty or if list contains only one element
		if(head==null || head.next==null)
			return;
		
		SLNode prev=head;
		SLNode cur=head.next;
		
		head=cur;
		
		while(true){
			SLNode next=cur.next;
			cur.next=prev;
		
			if(next==null || next.next==null){
				  prev.next=next;
				  break;
			}
			
			prev.next=next.next;
			prev=next;
			cur=prev.next;
		
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem22 p=new Problem22();
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		p.printList();
		System.out.println();
		p.pairwiseLinkSwap(p.Head);
		
		System.out.println("After pairwise swap");
		p.printList();

	}

}
