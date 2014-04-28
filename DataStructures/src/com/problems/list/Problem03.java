package com.problems.list;

import com.ds.list.SLNode;
import com.ds.list.SingleLinkedList;

public class Problem03 extends SingleLinkedList{
	
	
	private int getNumberofOccurrences(int number){
		
		int count=0;
		SLNode cur=Head;
		while(cur!=null){
			if(cur.data==number)
				count++;
			cur=cur.next;
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem03 list=new Problem03();
		
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(10);
		list.insertAtEnd(10);
		list.insertAtEnd(40);
		list.printList();
		System.out.println("");
		
		System.out.println("The number of times the element occurrs is "+list.getNumberofOccurrences(30));
		
	}

}
