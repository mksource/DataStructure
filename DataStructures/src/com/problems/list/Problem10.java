package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

/*
 * 1. Reverse the list
 * 2. Traverse the reversed list keep the maximum  as of now and delete the next node  
 *    if it less than maximum
 * 3. reverse back the list    
 */
public class Problem10 extends SingleLinkedList{

	
	private SLNode reverseList(SLNode head){
		
		SLNode cur=head;
		SLNode prev=null;
		SLNode next=null;
		
		while(cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
	}
	private void delLessNode(SLNode head){
		
		int max=head.data;
		SLNode cur=head;
		SLNode prev=head;
		while(cur!=null){
			if(cur.data<max){
				prev.next=cur.next;
			}else{
				max=cur.data;
				prev=cur;
			}
			
			cur=cur.next;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem10 p=new Problem10();
		/*
		p.insertAtEnd(12);
		p.insertAtEnd(15);
		p.insertAtEnd(10);
		p.insertAtEnd(11);
		p.insertAtEnd(5);
		p.insertAtEnd(6);
		p.insertAtEnd(2);
		p.insertAtEnd(3);*/
		
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		
		
		p.printList();
		System.out.println("");
		p.Head=p.reverseList(p.Head);
		p.delLessNode(p.Head);
		p.Head=p.reverseList(p.Head);
		p.printList();

	}

}
