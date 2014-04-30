package com.problems.list;

import com.ds.list.SingleLinkedList;
import com.ds.list.SLNode;

public class Problem16 extends SingleLinkedList {

		
	private void deleteList(){
		
		SLNode cur=Head;
		
		//Move to the next Node
		while(cur!=null){
			SLNode deletenode=cur;
			
			System.out.println("The node to be deleted is "+deletenode.data);
			
			//Delete the Node by setting null
			deletenode=null;
			
			cur=cur.next;
		}
		
		//Set Head as null
		Head=null;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem16 p=new Problem16();
		p.insertAtEnd(10);
		p.insertAtEnd(20);
		p.insertAtEnd(30);
		p.insertAtEnd(40);
		p.insertAtEnd(50);
		p.insertAtEnd(60);
		
		p.deleteList();

	}

}
