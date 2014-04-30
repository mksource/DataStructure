package com.problems.list;

import com.ds.list.SLNode;
import com.ds.list.SingleLinkedList;

public class Problem23 extends SingleLinkedList{

	
	//Floyd Cycle finding algorithm
	private boolean detectCycle(){
		
		SLNode slowptr=Head;
		SLNode fastptr=Head;
		
		while(slowptr!=null && fastptr!=null && fastptr.next!=null){
			
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			if(slowptr==fastptr)
				return true;
		}
		
		return false;
	}
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Problem23 p=new Problem23();
	     
	     p.insertAtEnd(10);
	     p.insertAtEnd(20);
	     p.insertAtEnd(30);
	     p.insertAtEnd(40);
	     p.insertAtEnd(50);
	     p.Head.next.next.next.next=p.Head;
	     System.out.println("Does Linked List Have Cycle "+p.detectCycle());
	}

}
