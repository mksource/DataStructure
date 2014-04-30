package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem26 extends SingleLinkedList{

	
	private SLNode reverseAltKNodes(SLNode head,int k){
				
		SLNode prev=null;
		SLNode next=null;
		SLNode current=head;
		int count=1;
		while(current!=null && count<=k){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(head!=null)
			head.next=current;
		
		//Skip the nodes
		count=1;
		while(current!=null && count<=k){
			current=current.next;
			count++;
		}
		
		if(current!=null)
			current.next=reverseAltKNodes(current.next,k);
		
		
		return prev;
	}
	
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem26 p=new Problem26();
		
		p.insertAtEnd(1);
		p.insertAtEnd(2);
		p.insertAtEnd(3);
		p.insertAtEnd(4);
		p.insertAtEnd(5);
		p.insertAtEnd(6);
		p.insertAtEnd(7);
		p.insertAtEnd(8);
		p.insertAtEnd(9);
		p.insertAtEnd(10);
		p.insertAtEnd(11);
		p.insertAtEnd(12);
		
		p.printList();
		System.out.println();
		p.Head=p.reverseAltKNodes(p.Head, 3);
		p.printList();
	}

}
