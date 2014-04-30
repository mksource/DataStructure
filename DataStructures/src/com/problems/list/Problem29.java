package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem29 extends SingleLinkedList{

	
	private void AlternateSplit(){
		
		SLNode list1=null;
		SLNode list2=null;
		SLNode current=Head;
		int count=0;
		
		while(current!=null){
			
			SLNode next=current.next;
			if(count%2==0){
				current.next=list1;
				list1=current;
			}
			else if(count%2==1){
				current.next=list2;
				list2=current;			
			}
			count++;
			current=next;
		}
		
		
		while(list1!=null){
			System.out.print(list1.data+" ");
			list1=list1.next;
		}
		System.out.println("");
		while(list2!=null){
			System.out.print(list2.data+" ");
			list2=list2.next;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem29 p=new Problem29();
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		p.insertAtEnd(70);
		p.printList();
		System.out.println("");
		p.AlternateSplit();
		

	}

}
