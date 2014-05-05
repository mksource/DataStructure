package com.problems.list;

import com.ds.list.CircularLinkedList;
import com.ds.list.SLNode;

public class Problem30 extends CircularLinkedList{

	
	public void insertOrder(int element){
		
		//Form a new node
		SLNode newNode=new SLNode();
		newNode.data=element;
		
		//If the List is empty
		if(TAILER==null){
			TAILER=newNode;
			TAILER.next=TAILER;
			return;
		}
		
		//List contains only one element
		if(TAILER.next==TAILER){
			
			if(element<TAILER.data)
				insertAtFront(element);
			else
				insertAtFront(element);
			return;
		}
		
		
		SLNode cur=TAILER.next;
		SLNode prev=TAILER;
		do{
			if(element<cur.data){
				prev.next=newNode;
				newNode.next=cur;
				return;
			}
			prev=cur;
			cur=cur.next;
			
		}while(cur!=TAILER);
	  
		//If the node has to inserted at last then insert
		insertAtBack(element);
		
	
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem30 p=new Problem30();
		p.insertOrder(25);
		p.insertOrder(10);
		p.insertOrder(15);
		p.displayList();
		System.out.println();
		p.insertOrder(12);
		p.insertOrder(7);
		p.insertOrder(78);
		p.displayList();
	}

}
