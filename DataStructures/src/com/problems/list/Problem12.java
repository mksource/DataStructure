package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem12 extends SingleLinkedList{

	
	private void moveLast(){
		
		SLNode cur=Head;
		SLNode prev=Head;
		
		while(cur.next!=null){
			prev=cur;
			cur=cur.next;
		}
		prev.next=null;
		SLNode oldhead=Head;
		Head=cur;
	    cur.next=oldhead;
	    
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem12 p=new Problem12();
		
		p.insertAtEnd(1);
		p.insertAtEnd(2);
		p.insertAtEnd(3);
		p.insertAtEnd(4);
		p.insertAtEnd(5);
		p.printList();
		
		System.out.println("");
		p.moveLast();
		p.printList();
	}

}
