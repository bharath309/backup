package com.bellinfo.java02_12_2018;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class ArrayListAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<>();
		//ArrayList<Integer> a2=new ArrayList<>();
		LinkedList<Integer>ll=new LinkedList<>();
		Random r1=new Random();
		Timestamp t=new Timestamp(System.currentTimeMillis());
		System.out.println("***********ArrayList**************");
		//System.out.println(a1.size());
		System.out.println(t.toString());
		long start=System.currentTimeMillis();
		for(int i=0;i<500000;i++) {
			a1.add(r1.nextInt());
			
		}
		System.out.println(a1.get(488));
		a1.remove(488);
		System.out.println(a1.get(488));
		System.out.println(t.toString());
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
		/*Iterator it=a2.iterator();
		while(it.hasNext()) { //boolean
			System.out.println(it.next());
		}*/
		
		/*******************************************************************************************/
		System.out.println("***********LinkedList**************");
		System.out.println(t.toString());
		long star=System.currentTimeMillis();
		for(int i=0;i<500000;i++) {
			ll.add(r1.nextInt());
			
		}
		System.out.println(a1.get(488));
		a1.remove(488);
		System.out.println(a1.get(488));
		long en=System.currentTimeMillis();
		System.out.println(t.toString());
		System.out.println(en-star);
	}

}
