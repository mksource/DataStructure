package com.problems.list;

import com.ds.list.CircularLinkedList;
import com.ds.list.SLNode;


public class Problem07 extends CircularLinkedList{

	
	private void splitcircularlist(){
		
	   //Find the middle of the circular linked list 
	   SLNode fastptr=TAILER.next;
	   SLNode slowptr=TAILER.next;
	   
	   while(fastptr!=TAILER && fastptr.next!=TAILER){
		   fastptr=fastptr.next.next;
		   slowptr=slowptr.next;
	   }
	
	   if(fastptr.next!=TAILER)
		   fastptr=fastptr.next;
	   
	   SLNode list2Head=slowptr.next;
	   SLNode TAILER2=fastptr;
	   TAILER2.next=list2Head;
	   
	   SLNode list1Head=TAILER.next;
	   SLNode TAILER1=slowptr;
	   TAILER1.next=list1Head;
	   
	   System.out.println("Printing the first circular list"); 
	   SLNode cur=TAILER1;
	   do{
		   System.out.print(cur.data+" ");
		   cur=cur.next;
	   }while(cur!=TAILER1);
	   
	   System.out.println(" ");
	   
	   cur=TAILER2;
	   do{
		   System.out.print(cur.data+" ");
		   cur=cur.next;
	   }while(cur!=TAILER2);
	   System.out.println("Printing the second circular list");
		
	}
		
	public static void main(String args[]){
		
		Problem07 p=new Problem07();
		
		p.insertAtBack(10);
		p.insertAtBack(20);
		p.insertAtBack(30);
		p.insertAtBack(40);
		p.insertAtBack(50);
		p.insertAtBack(60);
		p.insertAtBack(70);
		p.insertAtBack(80);
		
		p.displayList();
		System.out.println(" ");
		p.splitcircularlist();
		
	}

}
