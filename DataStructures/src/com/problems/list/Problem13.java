package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem13 extends SingleLinkedList{

	
	private void pairwiseswap(){
		
		SLNode temp=Head;
		
		while(temp!=null && temp.next!=null){
			
			int dtemp=temp.data;
			temp.data=temp.next.data;
			temp.next.data=dtemp;
			
			temp=temp.next.next;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem13 p=new Problem13();
		p.insertAtEnd(1);
		p.insertAtEnd(2);
		p.insertAtEnd(3);
		p.insertAtEnd(4);
		p.insertAtEnd(5);
		p.printList();
		System.out.println("");
		
		p.pairwiseswap();
		p.printList();
		System.out.println("");

	}

}
