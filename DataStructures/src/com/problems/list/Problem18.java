package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem18 extends SingleLinkedList {

	
	private void removeduplicates(){
		
	   SLNode cur=Head;
	   
	   if(cur==null)
		   return;
	   
	   while(cur.next!=null){
		   
		   if(cur.data==cur.next.data){
			   
			   SLNode next=cur.next.next;
			   cur.next=null;
			   cur.next=next;
			   
		   }
		   else{
			   cur=cur.next;
		   }
	   }
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem18 p=new Problem18();
		
		p.insertAtEnd(11);
		p.insertAtEnd(11);
		p.insertAtEnd(11);
		p.insertAtEnd(21);
		p.insertAtEnd(43);
		p.insertAtEnd(43);
		p.insertAtEnd(60);
		p.printList();
		System.out.println(" ");
		p.removeduplicates();
		p.printList();

	}

}
