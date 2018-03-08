package com.bellinfo.java02_5_2018;

public class Assign4pg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="This is a java class";
		int b=a.length();
		int c=b/2;
		System.out.println(c);
		if(c%2==0) {
		System.out.println(a.charAt(c));
		}
		else if (c%2==1) {
			System.out.println(a.charAt(c+1));
		}
	}
}
