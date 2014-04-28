package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem09 extends SingleLinkedList {

	
	private void counterClockwise(int k){
		
		SLNode cur=Head;
		
		while(k!=1){
			cur=cur.next;
			k--;
		}
		
		SLNode oldhead=Head;
		SLNode oldlast=cur;
		SLNode newhead=cur.next;
		while(cur.next!=null)
		     cur=cur.next; 
		oldlast.next=null;
		cur.next=oldhead;
		Head=newhead;
	    	
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem09 p=new Problem09();
		
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		
		p.printList();
		System.out.println("");
		p.counterClockwise(4);
		p.printList();
		
	}

}
