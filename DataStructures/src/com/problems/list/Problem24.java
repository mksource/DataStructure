package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem24 extends SingleLinkedList{

	
	private static int getCount(SLNode head){
	
		SLNode cur=head;
		int count=0;
		while(cur!=null){
			count++;
			cur=cur.next;
		}
		return count;
	} 
	
	private static int getInersectionNode(SLNode head1,SLNode head2){
		
		//Get the count
		int c1=getCount(head1);
		int c2=getCount(head2);
		
		//Traverse the longer list
		if(c1 < c2){
			int d=c1-c2;
			for(int i=0;i<d;i++)
				head2=head2.next;
				
		}
		else{
			int d=c1-c2;
			for(int i=0;i<d;i++)
				head1=head1.next;
		}
		
		while(head1!=null && head2!=null){
			if(head1==head2)
				  return head1.data;
			head1=head1.next;
			head2=head2.next;
		}
		return -1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem24 p1=new Problem24();
		p1.insertAtEnd(3);
		p1.insertAtEnd(6);
		p1.insertAtEnd(9);
		p1.insertAtEnd(15);
		p1.insertAtEnd(30);
		
		Problem24 p2=new Problem24();
		p2.insertAtEnd(10);
		p2.Head.next=p1.Head.next.next.next;
		
		System.out.println("Printing out the first list");
		p1.printList();
		System.out.println("Printing out the second list");
		p2.printList();
		System.out.println("The intersection point is "+getInersectionNode(p1.Head,p2.Head));

	}

}
