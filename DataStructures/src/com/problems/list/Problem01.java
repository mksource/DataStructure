package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem01 extends SingleLinkedList{

	
	public void  getNthElement(int N){
		
		SLNode cur=Head;
		int count=1;
		boolean found=false;
		
		while(cur!=null){
			if(count==N){
				System.out.println("Element found "+cur.data);
				found=true;
				break;
			}
			cur=cur.next;
			count++;
		}
		
		if(!found)
			System.out.println("Element not found");
	}
	
	
	
	public static void main(String args[]){
		
		Problem01 p=new Problem01();
		
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
		
		p.getNthElement(11);
	}

}
