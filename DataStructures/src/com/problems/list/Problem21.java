package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem21 extends SingleLinkedList{

	
	private void separateAlternateNodes(){
		
		SLNode cur=Head;
		SLNode prev=null;;
		SLNode altnode = null;
		int  pos=1;
		
		while(cur.next!=null){
			
			if(pos%2==0){
				prev.next=cur.next;
				cur.next=altnode;
				altnode=cur;
				cur=cur.next;
			}
			else{
				prev=cur;
				cur=cur.next;
				
						
			}
			
		}
		
		cur.next=altnode;
		
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem21 p=new Problem21();
		p.insertAtEnd(1);
		p.insertAtEnd(2);
		p.insertAtEnd(3);
		p.insertAtEnd(4);
		p.insertAtEnd(5);
		p.insertAtEnd(6);
	}

}
