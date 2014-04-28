package com.ds.list;

import com.ds.utils.UnderflowException;

public class CircularLinkedList {

	
	protected SLNode TAILER;
	
	public CircularLinkedList(){
		TAILER=null;
	}
    public boolean isEmpty(){
    	return TAILER==null;
    }
	public void insertAtFront(int element){
	
		    SLNode newNode=new SLNode();
		    newNode.data=element;
	    	if(isEmpty()){
			   TAILER=newNode;
			   TAILER.next=TAILER;
	     	}
	    	else{
	    		SLNode first=TAILER.next;
	    		newNode.next=first;
	    		TAILER.next=newNode;
	    	}
		
	}
	public void insertAtBack(int element){
		   
		  SLNode newNode=new SLNode();
		  newNode.data=element;
		  if(isEmpty()){
			  TAILER=newNode;
			  TAILER.next=TAILER;
		  }
		  else{
			  SLNode first=TAILER.next;
			  TAILER.next=newNode;
			  newNode.next=first;
			  TAILER=newNode;
		  }
		
		
	}
	public int removeAtFront(){
		
		if(isEmpty()){
			throw new UnderflowException("List is Empty");
		}
		else{
			if(TAILER.next==TAILER){
				int element=TAILER.data;
				TAILER=null;
				return element;
			}
			SLNode newHead=TAILER.next.next;
			int data=TAILER.next.data;
			TAILER.next=newHead;
			return data;
		}
		
	}
	public int removeAtBack(){
		
		if(isEmpty()){
			throw new UnderflowException("List is Empty");
		}
		else{
			if(TAILER.next==TAILER){
				int element=TAILER.data;
				TAILER=null;
				return element;
			}
			int data=TAILER.data;
			SLNode first=TAILER.next;
			SLNode cur=TAILER.next;
			while(cur.next!=TAILER)
				cur=cur.next;
			cur.next=first;
			TAILER=cur;
			return data;			
		}
	}
	
	public void displayList(){
		
		SLNode cur=TAILER;
		do{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}while(cur!=TAILER);
	}
}
