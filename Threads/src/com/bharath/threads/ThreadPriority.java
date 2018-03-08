package com.bharath.threads;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg=new ThreadGroup("ftg");
		Thread t1=new Thread(tg,"FT");
		Thread t2=new Thread(tg,"ST");
		
		tg.setMaxPriority(3);
		Thread t3=new Thread(tg,"TT");
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t1.getPriority());
	}

}
