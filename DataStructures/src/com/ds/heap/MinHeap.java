package com.ds.heap;

import java.lang.reflect.Array;

public class MinHeap<E extends Comparable<E>> {

	
	private E elements[];
	private int size;
	private int maxSize;
	
	public MinHeap(int max){
		
		elements=(E[])new Object[max];
		maxSize=max;
		size=0;
		
	}
	
	private int parent(int pos){
		return pos/2;
	}
	private int leftChild(int pos){
		return 2*pos+1;
	}
	private int rightChild(int pos){
		return 2*pos+2;
	}
	
	
	private boolean isLeaf(int pos){
		
		if(pos >= (size/2) && pos <= size)
			return true;
		else
			return false;
	}

	private void swap(int fpos,int spos){
		
		E tmp;
		tmp=elements[fpos];
		elements[fpos]=elements[spos];
		elements[spos]=tmp;
	}
	
	public void insert(E element){
		
		
		elements[++size]=element;
		int current=size;
		
		while(elements[current].compareTo(elements[parent(current)])<0){
			
		}
	}
}
