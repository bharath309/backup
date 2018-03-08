package com.bellinfo.java02_5_2018;

public class Assign4pg9 {

	public static void main(String[] args) {
		// Number of times each letter repeated.
		String s="This is a Java Class";
		s=s.trim();
		s=s.replace(" " , "");
		
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count = 0;
			for(int j=0;j<s.length();j++) {
				if(i>j &&ch[i]==ch[j]) {
					break;		
				}
				if(ch[i]==ch[j]) {
					count++;
				}
				if(j==s.length()-1) {
				System.out.println(ch[i]+" "+count);
				}				
			}
		}
	}

}
