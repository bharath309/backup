package com.bellinfo.java02_12_2018;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(20);
		hs.add(40);
		hs.add(90);
		hs.add(40);
		System.out.println("********************HashSet**********************");
		System.out.println("***Using regular for loop approach hashset doesn't work");
		Object[] arry=hs.toArray();
				for(int i=0;i<arry.length;i++) {
			System.out.print(arry[i]+" ");
		}
				System.out.println("********************TreeSet**********************");
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(20);
		ts.add(45);
		ts.add(85);
		ts.add(45);
		Object[] arry1=ts.toArray();
		for(int i=0;i<arry1.length;i++) {
			System.out.print(arry1[i]+" ");
		}
}
	}


