package com.problems.list;

import com.ds.list.SLNode;
import com.ds.list.SingleLinkedList;

public class Problem14 extends SingleLinkedList{

	
	
	
	private static SLNode mergeList(SLNode list1,SLNode list2){
		
		SLNode fakenode=new SLNode();
		SLNode p=fakenode;
		
		while(list1!=null && list2!=null){
			if(list1.data<list2.data){
				p.next=list1;
				list1=list1.next;
			}else{
				p.next=list2;
				list2=list2.next;
			}
			p=p.next;
		}
		
		if(list1!=null){
			p.next=list1;
		}
		
		if(list2!=null){
			p.next=list2;
		}
		
		return fakenode.next;
			
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem14 list1=new Problem14();
		list1.insertAtEnd(5);
		list1.insertAtEnd(10);
		list1.insertAtEnd(15);
		
		Problem14 list2=new Problem14();
		list2.insertAtEnd(2);
		list2.insertAtEnd(3);
		list2.insertAtEnd(20);
		
		SLNode p=mergeList(list1.Head,list2.Head);
		while(p!=null){
			System.out.print(p.data+"\t");
			p=p.next;
		}
	}

}
