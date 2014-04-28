package com.ds.list;

import com.ds.utils.UnderflowException;

public class DoublyLinkedList {

	protected DLNode HEADER;
	protected DLNode TAILER;
	
	public DoublyLinkedList(){
		
		HEADER=new DLNode();
		TAILER=new DLNode();
		
		HEADER.next=TAILER;
		HEADER.prev=null;
		TAILER.prev=HEADER;
		TAILER.next=null;
	}
	
	public boolean isEmpty(){
		return HEADER.next==TAILER;
	}
	public void insertAtFront(int element){
		
		DLNode newNode=new DLNode();
		newNode.data=element;
		
		DLNode oldFirst=HEADER.next;
		newNode.next=oldFirst;
		oldFirst.prev=newNode;
		HEADER.next=newNode;
		newNode.prev=HEADER;
		
	}
	public void insertAtEnd(int element){
		
		DLNode newNode=new DLNode();
		newNode.data=element;
		
		DLNode oldLast=TAILER.prev;
		newNode.prev=oldLast;
		oldLast.next=newNode;
		newNode.next=TAILER;
		TAILER.prev=newNode;
	}
	public int removeAtEnd(){
		
		if(isEmpty()){
			throw new UnderflowException("List is Empty");
		}
		else{
			DLNode oldlast=TAILER.prev;
			DLNode newlast=oldlast.prev;
			TAILER.prev=newlast;
			newlast.next=TAILER;
			return oldlast.data;
		}
		
	}
	public int removeAtFront(){
		
		if(isEmpty()){
			throw new UnderflowException("List is Empty");
		}else{
			DLNode oldFront=HEADER.next;
			DLNode newFront=oldFront.next;
			HEADER.next=newFront;
			newFront.prev=HEADER;
			return oldFront.data;
		}
	}
	
	public void printList(){
		
		DLNode cur=HEADER.next;
		while(cur!=TAILER){
			
			System.out.print(cur.data+"\t");
			cur=cur.next;
		}
	}

}
