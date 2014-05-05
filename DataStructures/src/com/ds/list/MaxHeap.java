package com.ds.list;

public class MaxHeap {
	
	private int[] Heap;
	private int   size;
	private int   maxsize;
	private static int FRONT=1;
	
	//Heap is stored as a complete binary tree
	public MaxHeap(int maxsize){
		
		this.maxsize=maxsize;
		this.size=0;
		Heap=new int[this.maxsize+1];
		Heap[0]=Integer.MAX_VALUE;
		
	}

	
	private int parent(int pos){
		return pos/2;
	}
	private int leftChild(int pos){
		return 2*pos;
	}
	private boolean isLeaf(int pos){
		
		if(pos>=size/2 && pos<=size)
			return true;
		else
			return false;
	}
	private void swap(int i,int j){
		
		int temp=Heap[i];
		Heap[i]=Heap[j];
		Heap[j]=temp;
	}
	private boolean less(int i,int j){
		if(Heap[i]<Heap[j])
			return true;
		else
			return false;
			
	}
	private void maxHeapify(int pos){
		
		if(!isLeaf(pos)){
			
			int child=leftChild(pos);
			
			//find the maximum child to be swapped with
			if(child<size && less(child,child+1))child++;
			
			if(!less(pos,child)) return;
			
			swap(pos,child);
			
			maxHeapify(child);
		}
		
	}
	public int size(){
		return size;
	}
	public void insert(int element){
		
		Heap[++size]=element;
		int current=size;
		
		while(less(parent(current),current)){
			swap(current,parent(current));
			current=parent(current);
		}
	}
	public int remove(){
		
		int popped=Heap[FRONT];
		Heap[FRONT]=Heap[size--];
		maxHeapify(FRONT);
		return popped;
	}
	public void printHeap(){
		
		for(int i=1;i<=size/2;i++){
			
			System.out.print("PARENT: "+Heap[i]+" LEFT CHILD: "+Heap[2*i]+" RIGHT CHILD:"+Heap[2*i+1]);
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		
		MaxHeap heap=new MaxHeap(100);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.insert(50);
		heap.insert(60);
		heap.insert(10);
		heap.insert(12);
		
		heap.printHeap();
		System.out.println("");
		
		int size=heap.size();
		for(int i=0;i<size;i++){
			System.out.print(heap.remove()+" ");
			
		}
	}
	
}
