package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem02 extends SingleLinkedList{

	
	/*Method01 
	 * Calculate the length of the list say k
	 * Then traverse to the k-N node from the beginning of the list
	 */
	
	/*
	 * Method02
	 * Have two pointers reference and main pointer.Traverse the list with 
	 * reference pointer from beginning till we reach the N nodes in the list
	 * after start from the main pointer
	 */
	public void NthNodeFromEnd(int N){
		
		SLNode ref=Head;
		SLNode main=Head;
		int count=1;
		
		//Traverse to first N nodes
		while(count!=N){
			ref=ref.next;
			count++;
		}
		
		if(ref==null){
			System.out.println("Nth element not found in the list");
			return;
		}
		while(ref.next!=null){
			ref=ref.next;
			main=main.next;
		}
		
		System.out.println("The Nth element from the end of the list is "+main.data);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem02 p=new Problem02();
		
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		p.insertAtEnd(70);
		p.insertAtEnd(80);
		
		p.printList();
		System.out.println("");
		
		p.NthNodeFromEnd(1);

	}

}
