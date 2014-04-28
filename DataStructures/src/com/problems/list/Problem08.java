package com.problems.list;

/*
 * Implementing a LRU cache
 */

/*
 * A cache mechanism by which future request for data are served faster and at a lower cost
 * 
 * Requirements
 * 1. Fixed Size: The cache needs have a bounds to limit memory usage
 * 2. Fast  access: The lookup and insert operations must take O(1) time
 * 3. Entry Replacement algorithm: When the cache is full least recently used items must be removed 
 *    from the cache to make way for new items
 * 
 */
import java.util.HashMap;

class DoublyLinkedListNode{
	public int value;
	public int key;
	public DoublyLinkedListNode prev;
	public DoublyLinkedListNode next;
	
	public DoublyLinkedListNode(int key,int value){
		this.key=key;
		this.value=value;
	}
}

public class Problem08 {

	
	 private HashMap<Integer,DoublyLinkedListNode> map=new HashMap<Integer,DoublyLinkedListNode>();
	 private DoublyLinkedListNode head;
	 private DoublyLinkedListNode end;
	 private int capacity;
	 private int len;
	
	 public Problem08(int capacity){
		 this.capacity=capacity;
		 this.len=0;
	 }
	 
	 public int get(int key){
		    if(map.containsKey(key)){
		    	DoublyLinkedListNode latest=map.get(key);
		    	removeNode(latest);
		    	setHead(latest);
		    	return latest.value;
		    }else{
		    	return -1;
		    }
		    	
		 
	 }
	 public void set(int key,int value){
		 if(map.containsKey(key)){
			 DoublyLinkedListNode oldnode=map.get(key);
			 oldnode.value=value;
			 removeNode(oldnode);
			 setHead(oldnode);
		 }
		 else{
			 DoublyLinkedListNode node=new DoublyLinkedListNode(key, value);
			 
			 if(len<capacity){
				 setHead(node);
				 map.put(key,node);
				 len++;
			 }else{
				 
				 map.remove(end.key);
				 end=end.prev;
				 if(end!=null)
					 end.next=null;
				 
				 setHead(node);
				 map.put(key,node);
			 }
		 }
	 }
	 public void removeNode(DoublyLinkedListNode node){
		 DoublyLinkedListNode cur=node;
		 DoublyLinkedListNode prev=cur.prev;
		 DoublyLinkedListNode post=cur.next;
		 
		 if(prev!=null){
			 prev.next=post;
		 }else{
			 head=post;
		 }
		 
		 if(post!=null){
			 post.prev=prev;
		 }else{
			 end=prev;
		 }
		 
	 }
	 public void setHead(DoublyLinkedListNode node){
		 	node.next=head;
		 	node.prev=null;
		 	
		 	if(head!=null){
		 		head.prev=node;
		 	}
		 	head=node;
		 	if(end==null){
		 		end=node;
		 	}
		 
	 }
	

}
