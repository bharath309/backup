package com.bharath.javaassign6;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []a= {32,43,4,97,97,35,2,13,45};
		List<Integer> l=Arrays.asList(a);
		TreeSet<Integer> ts=new TreeSet<>();
		ts.addAll(l);
		
		System.out.print(ts);
		Object[] b= ts.toArray();
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		/*System.out.println();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}*/
		
		/*Arrays.toString(a);
		System.out.println(Arrays.toString(a));
		System.out.println();*/
	
		
		/*for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]>a[i]) {
					int b=a[j];
					a[j]=a[i];
					a[i]=b;
				}
			}
		
		}*/
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");	
			System.out.println();
		if(a[a.length-2]==a[i]) {
			same=false; 
		}
		else if(a[a.length-2]==a[a.length-1]) {
			same=false;
		}
	}
		*/
		System.out.println();
		System.out.println("The Second Largest value is: "+b[b.length-2]);

	}
}
