package com.bellinfo.java02_12_2018;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Apple";
		String b="Banana";
		String c ="Citrus";
		String g="Grapes";
		String o="Orange";
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add(a);
		a1.add(b);
		a1.add(c);
		a1.add(g);
		a1.add(o);
		for(String fruits:a1) {
			System.out.print(fruits+" ");
		}
		System.out.println(a1.get(2));
		System.out.println(a1.remove(1));
		System.out.println(a1);
		System.out.println("***********************ArrayList********************************");
		LinkedList<String> l1=new LinkedList<>();
		l1.add(b);l1.add(a);l1.add(c);l1.add(g);l1.add(o);
		for( String fruits:l1) {
			System.out.print(fruits+" ");
		}
		System.out.println(l1.get(2));
		System.out.println(l1.remove(1));
		System.out.println(l1);
		System.out.println("***********************LinkedList********************************");
		HashSet<String> h1=new HashSet<>();
		h1.add(b);h1.add(a);h1.add(c);h1.add(g);h1.add(o);
		for(String fruits:h1) {
			System.out.print(fruits+" ");
		}
		//System.out.println(h1.g);
		System.out.println(h1.remove(1));
		System.out.println(h1);
		System.out.println("***********************LinkedList********************************");
		TreeSet<String> t1=new TreeSet<>();
		t1.add(b);t1.add(a);t1.add(c);t1.add(g);t1.add(o);
		for(String fruits:t1) {
			System.out.print(fruits+" ");
		}
		//System.out.println(h1.g);
		//System.out.println(t1.remove(1));
		System.out.println(t1);
		System.out.println("***********************LinkedList********************************");

		
	}

}
