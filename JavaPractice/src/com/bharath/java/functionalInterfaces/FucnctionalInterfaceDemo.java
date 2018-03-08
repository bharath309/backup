package com.bharath.java.functionalInterfaces;

public class FucnctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new Runnable() {
			public void run() {          
				System.out.println("In other thread");
			}
		});
		t.start();
		System.out.println(" In main");
	}

}
