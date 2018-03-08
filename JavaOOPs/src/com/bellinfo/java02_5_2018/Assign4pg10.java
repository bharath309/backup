package com.bellinfo.java02_5_2018;

public class Assign4pg10 {

	public static void main(String[] args) {
		
		String s="this is a java class";
		s=s.trim();
		int c=1;
		
		for(int i=0;i<s.length()-1;i++) {
			
			if(((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))) {
				c++;
				System.out.println(s.charAt(i+1));
			}
		}
		System.out.println(c);
	}

}
