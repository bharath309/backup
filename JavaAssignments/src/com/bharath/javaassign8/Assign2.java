package com.bharath.javaassign8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		Random r1=new Random();
		for(int i=0;i<=10;i++) {
			al.add(r1.nextInt());
		}
		System.out.println(al);
		
		System.out.println(Collections.min(al));
		
		Collections.reverse(al);
		System.out.println(al);
		HashSet<Integer> hs=new HashSet<>();
		hs.addAll(al);
		System.out.println(Collections.min(hs));
	}

}
