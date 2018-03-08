package com.bharath.javaassign6;

import java.util.TreeSet;

public class SortGivenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[]x= new int[5];
		int[]x= {23,45,656 ,7,435};
		/*Scanner in=new Scanner(System.in);
		for(int i=0;i<x.length;i++) {
			x[i]=in.nextInt();
		}*/
		TreeSet<Integer> ts=new TreeSet<>();
		/*Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		int e=in.nextInt();*/
		for(int i=0;i<x.length;i++) {
			ts.add(x[i]);
		}
		//System.out.println(ts);
		System.out.println(ts);
		
		
		
	}

}
