package com.ds.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {

	private int N;  //number of items in the Bag
	private Node<Item> first;
	
	//helper linked list node
	private static class Node<Item>{
		private Item item;
		private Node<Item> next;
	}
	
	public Bag(){
		first=null;
		N=0;
	}
	
	//Return the size of the Bag
	public int size(){
		return N;
	}
	
	//Find out whether the bag is empty
	public boolean isEmpty(){
		return first==null;
	}
	
	//Add an item into Bag 
	public void add(Item item){
		Node<Item> oldfirst=first;
		first=new Node<Item>();
		first.item=item;
		first.next=oldfirst;
		N++;
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator<Item>(first);
	}
	
	private class ListIterator<Item> implements Iterator<Item>{

		private Node<Item> current;
		
		public ListIterator(Node<Item> first){
			current=first;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			if(!hasNext())throw new NoSuchElementException();
			Item item=current.item;
			current=current.next;
			return item;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
		
	}

}
