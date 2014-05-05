package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem31a extends SingleLinkedList{
	
	/*
	 * In this approach we assume least significant element is reprsented 
	 * by the head of the list
	 */
	
	public static void addList(SLNode first,SLNode second){
		
		//Create a SumList 
		SLNode sumList=null;
		SLNode prev=null;
		int carry=0;
		
		while(first!=null || second!=null){
			
			//Add the two integers from both list if the elements exists
			int sum=carry+(first!=null?first.data:0)+(second!=null?second.data:0);
			
			carry=(sum>=10)?1:0;
			
			sum=sum%10;
			
			SLNode temp=new SLNode();
			temp.data=sum;
			
			if(sumList==null)
				sumList=temp;
			else
				prev.next=temp;
			prev=temp;
			
			if(first != null)first=first.next;
			if(second!=null)second=second.next;
			
			
			
		}
		
		if(carry>0)
			prev.next=new SLNode(carry);
		
		while(sumList!=null){
			System.out.print(sumList.data+" ");
			sumList=sumList.next;
		}	
		    
		
	}
	
	
	public static void main(String args[]){
		
		Problem31a list1=new Problem31a();
		list1.insertAtEnd(5);
		list1.insertAtEnd(6);
		list1.insertAtEnd(3);
		
		Problem31a list2=new Problem31a();
		list2.insertAtEnd(8);
		list2.insertAtEnd(4);
		list2.insertAtEnd(2);
		
		addList(list1.Head,list2.Head);
		
	}

}
