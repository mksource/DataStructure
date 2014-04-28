package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem11 extends SingleLinkedList{

	
	private void separateEvenOdd(){
		
		//Traverse the linked list
		SLNode cur=Head;
		SLNode last=Head;
		SLNode prev=null;
		SLNode new_node;
		
		//Traverse till the last node in the linked list
		while(last.next!=null)
			last=last.next;
		
		//Move the odd numbers to the end of the linked list
		//Till we encounter the first even node
		new_node=last;
		while(cur!=null && cur.data%2!=0){
			new_node.next=cur;
			cur=cur.next;
			new_node.next.next=null;
			new_node=new_node.next;
			
		}
		
		//If we encounter the first even node
		if(cur.data%2==0){
			Head=cur;
			
			while(cur!=null){
				
				if(cur.data%2==0){
					prev=cur;
					cur=cur.next;
				}
				else{
					 //Delete odd node by breaking the linkage
					 prev.next=cur.next;
					 
					 //Make the node as the last node
					 cur.next=null;
					 new_node.next=cur;
					 new_node=cur;
					 
					 //update the current pointer
					 cur=prev.next;
					
				}
				
			}
		}
		else
			prev=cur;
		
		
		
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
