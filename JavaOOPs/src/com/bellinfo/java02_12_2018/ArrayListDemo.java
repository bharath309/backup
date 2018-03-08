package com.bellinfo.java02_12_2018;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		System.out.println("***********ArrayList**************");
		//System.out.println(a1.size());
		a1.add(20);
		for(int i=0;i<5;i++) {
			a1.add(i);
			
			System.out.println(a1.get(i));
		}
		System.out.println("**********************************");
		@SuppressWarnings("rawtypes")
		Iterator it=a2.iterator();
		while(it.hasNext()) { //boolean
			System.out.println(it.next());
		}
		System.out.println("**********************************");
		for(Integer intgr:a1) {
			System.out.println(intgr);
		}
		////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("****************LinkedList*********************");
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(40);
		ll.add(35);
		ll.add(65);
		ll.add(85);
		System.out.println("*************forloop*****************");
		for(int i=0;i<5;i++) {
			
			System.out.println(ll.get(i));
		}
		System.out.println("*****************");
		
	}

}
