package com.problem.dp;

import java.util.Arrays;

class Box implements Comparable<Box>{
	
	//for simplicity of the solution we assume w <= d
	public Box(int h,int w,int d){
		this.h=h;
		this.w=w;
		this.d=d;
	}
	public int h;
	public int w;
	public int d;
	@Override
	public int compareTo(Box b) {
		// TODO Auto-generated method stub
		return (b.w*b.d)-(this.w*this.d);
	}
}

public class Problem18 {

	
	private int max(int a,int b){
		return (a > b)?a:b;
	}
	private int min(int a,int b){
		return (a < b)?a:b;
	}
	
	public int maxStackHieght(Box arr[]){
		
		
		//number of boxes
		int n=arr.length;
		
		//contains the rotations
		Box[] rots=new Box[3*n];
		
		//Hold all the rotations of the box
		int index=0;
		
		for(int i=0;i<n;i++){
			
			rots[index]=new Box(arr[i].h,arr[i].w,arr[i].d);
			index++;
			
			//First rotation of the box
			rots[index]=new Box(arr[i].w,min(arr[i].h,arr[i].d),max(arr[i].h,arr[i].d));
			index++;
			
			//Second rotation of the box
			rots[index]=new Box(arr[i].d,min(arr[i].h,arr[i].w),max(arr[i].h,arr[i].w));
			index++;
			
		}
		
		
		//Sort the array according the increasing order of the bases 
		Arrays.sort(rots);
		
		n=3*n;
		
		//Print all the rotations of the Box
		for(int i=0;i<n;i++){
			System.out.println(rots[i].h+" "+rots[i].w+" "+rots[i].d);
		}
		
		//Arrange the boxed according to the height
		int msh[]=new int[n];
		for(int i=0;i<n;i++)
			msh[i]=rots[i].h;
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				
				if(rots[i].w < rots[j].w && rots[i].d < rots[j].d && msh[i] < msh[j]+rots[i].h)
					msh[i]=msh[j]+rots[i].h;
				
			}
		}
		
		int max=-1;
		for(int i=0;i<n;i++){
			if(max < msh[i])
				max=msh[i];
		}
		
		return max;
		
	}
	
		
	public void solve(){
		
		Box arr[]={new Box(4,6,7),new Box(1,2,3),new Box(4,5,6),new Box(10,12,32)};
		System.out.println("The maximum height that can be done by stacking boxes is " +maxStackHieght(arr));
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem18 p=new Problem18();
		p.solve();
	}

}
