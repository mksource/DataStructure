package com.problems.list;

import com.ds.list.SLNode;
import com.ds.list.SingleLinkedList;

public class Problem25 extends SingleLinkedList{

	
	
	private void insertSortedList(int element){
		
		SLNode newNode=new SLNode(); 
		newNode.data=element;
		if(Head==null || element < Head.data){
			newNode.next=Head;
			Head=newNode;
		}
		
		SLNode cur=Head.next;
		SLNode prev=Head;
		
		while(cur.next!=null){
			if(element<cur.data){
				prev.next=newNode;
				newNode.next=cur;
				return;
			}
			prev=cur;
			cur=cur.next;
		}
		
		//We have reached the last node so insert in last
		cur.next=newNode;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem25 p=new Problem25();
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		p.printList();
		System.out.println();
		
		p.insertSortedList(25);
		p.printList();
		
	}

}
