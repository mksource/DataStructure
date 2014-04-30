package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;
import java.util.HashMap;

public class Problem17 extends SingleLinkedList{

	
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	
	
	private void removingDuplicates(){
		
		SLNode cur=Head;
		SLNode prev=null;
		
		while(cur!=null){
			
			int data=cur.data;
			if(map.containsKey(data)){
				//Duplicate
				prev.next=cur.next;
				cur=prev.next;
			}
			else{
				map.put(data,0);
				prev=cur;
				cur=cur.next;
			}
			
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem17 p=new Problem17();
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(20);
		p.insertAtEnd(10);
		p.insertAtEnd(60);
		p.insertAtEnd(30);
		
		p.printList();
		System.out.println("");
		p.removingDuplicates();
		p.printList();
		
	}

}
