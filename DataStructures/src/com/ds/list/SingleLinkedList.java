package com.ds.list;

import com.ds.utils.UnderflowException;

public class SingleLinkedList {

	protected SLNode Head;
	
	
	public void insertAtFront(int element){
		
		SLNode newNode=new SLNode();
		newNode.data=element;
		if(Head==null){
			Head=newNode;
			return;
		}		
		newNode.next=Head;
		Head=newNode;
			
		
	}
	public void insertAtEnd(int element){
		
		SLNode newNode=new SLNode();
		newNode.data=element;
		if(Head==null){
			Head=newNode;
			return;
		}	
		SLNode current=Head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=newNode;
	}
	public boolean isEmpty(){
		return Head==null;
	}
	
	public int removeAtEnd(){
		
		if(isEmpty()){
			throw new UnderflowException("List is Empty");
		}
		SLNode prev=null;
		SLNode cur=Head;
		while(cur.next!=null){
			prev=cur;
			cur=cur.next;
			
		}
		
		//Delete the last node
		prev.next=null;
		return cur.data;
		
	}
	public int removeAtFront(){
		
		if(isEmpty()){
			throw new UnderflowException("List is Empty");
		}
		int data=Head.data;
		Head=Head.next;
		return data;
	}
	public void printList(){
		
		SLNode current=Head;
		
		while(current!=null){
			System.out.print(current.data+"\t");
			current=current.next;
		}
		
	}

}
