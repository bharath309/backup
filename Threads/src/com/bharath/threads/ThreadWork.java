package com.bharath.threads;

public class ThreadWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup g1=new ThreadGroup("FirstGroup");
		System.out.println(g1.getParent().getName());//main 
		ThreadGroup g2=new ThreadGroup(g1,"SecondGroup");
		System.out.println(g2.getParent().getName());//FirstGroup
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}

}
