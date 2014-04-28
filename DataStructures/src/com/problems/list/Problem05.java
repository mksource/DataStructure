package com.problems.list;

import javax.sound.sampled.ReverbType;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem05 extends SingleLinkedList{
	
	
	
	public SLNode reverseList(){
		
		SLNode cur=Head;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem05 p=new Problem05();
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.printList();
		
		SLNode newHead=p.reverseList();
		while(newHead!=null){
			System.out.print(newHead.data+"\t");
			newHead=newHead.next;
		}
		

	}

}
