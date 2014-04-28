package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem04 extends SingleLinkedList{

    /*
     * Have Two pointers in the list Fast and Slow
     * Move the Fast pointer twice and Slow pointer once 
     * When Fast pointer would have reached the end of the list the Slow pointer
     * would have reached the middle of the list	
     */
	public void getMiddleInList(){
		
		SLNode fastptr=Head;
		SLNode slowptr=Head;
		
		while(fastptr!=null && fastptr.next!=null){
			
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
			
		}
		System.out.println("The middle of the linked list "+slowptr.data);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem04 p=new Problem04();
		
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		p.insertAtEnd(70);
		p.insertAtEnd(80);
		p.printList();
		System.out.println("");
				
		p.getMiddleInList();
	}

}
