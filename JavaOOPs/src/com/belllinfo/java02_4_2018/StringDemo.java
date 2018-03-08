package com.belllinfo.java02_4_2018;

public class StringDemo {

	public static void main(String[]args) {

		String s1="orange";
		String s2=new String("orange");
		String s3="apple";
		String s4="orange";
		String s5=new String("orange");


		if(s1==s2) {
			System.out.println("s1==s2 is true");
		}
		else {
			System.out.println("s1==s2 is false");

		}
		if(s1==s3) {
			System.out.println("s1==s2 is true");
		}
		else {
			System.out.println("s1==s2 is false");
		}
		if(s1==s4) {
			System.out.println("s1==s2 is true");
		}
		else {
			System.out.println("s1==s2 is false");
		}
		if(s1==s5) {
			System.out.println("s1==s2 is true");
		}
		else {
			System.out.println("s1==s2 is false");
		}
		if(s2==s5) {
			System.out.println("s1==s2 is true");
		}
		else {
			System.out.println("s1==s2 is false");
		}
		if(s1.equals(s2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(s1.equals(s3)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(s1.equals(s4)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(s1.equals(s5)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(s2.equals(s5)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
