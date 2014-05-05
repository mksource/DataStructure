package com.ds.list;

public class MinHeap {

	private int Heap[];
	private int size;
	private int maxsize;
	private int FRONT=1;
	
	public MinHeap(int maxsize){
		
		this.maxsize=maxsize;
		this.size=0;
		Heap=new int[this.maxsize+1];
		Heap[0]=Integer.MIN_VALUE;
	}
	
	private int parent(int pos){
		return pos/2;
	}
	private int leftChild(int pos){
		return 2*pos;
	}
	private boolean isLeaf(int pos){
		
		if(pos>size/2 && pos<=size)
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
	private void minHeapify(int pos){
		
		if(!isLeaf(pos)){
			
			int child=leftChild(pos);
			
			if(child>size)return;
			
			//find the maximum child to be swapped with
			if(less(child+1,child))child++;
			
			if(less(pos,child)) return;
			
		
			swap(pos,child);
			
			minHeapify(child);
		}
		
	}
	public int size(){
		return size;
	}
	public void insert(int element){
		
		Heap[++size]=element;
		int current=size;
		
		while(less(current,parent(current))){
			swap(current,parent(current));
			current=parent(current);
		}
	}
	public int remove(){
		
		int popped=Heap[FRONT];
		Heap[FRONT]=Heap[size--];
		minHeapify(FRONT);
		return popped;
	}
	public void printHeap(){
		
		for(int i=1;i<=size/2;i++){
			
			System.out.print("PARENT: "+Heap[i]+" LEFT CHILD: "+Heap[2*i]+" RIGHT CHILD:"+Heap[2*i+1]);
			System.out.println();
		}
	}
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinHeap heap=new MinHeap(100);
		
		heap.insert(20);
		heap.insert(23);
		heap.insert(5);
		heap.insert(15);
		heap.insert(21);
		heap.insert(11);
		heap.insert(789);
		heap.insert(85);
		heap.insert(3);
	
		System.out.println("Before Removal");
		heap.printHeap();
		
		int size=heap.size();
		for(int i=0;i<size;i++){
			System.out.println(heap.remove()+" ");
		
		}
		
		
	}

}
