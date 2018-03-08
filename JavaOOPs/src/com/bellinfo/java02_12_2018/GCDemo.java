package com.bellinfo.java02_12_2018;

public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************Program Started******************");
		GCDemo gc=new GCDemo();
		GCDemo gc1=new GCDemo();

		gc=null;//gc=gc1;
		System.gc();
		
	}
	protected void finalize() {
		System.out.println("closethe connection");
	}

}
