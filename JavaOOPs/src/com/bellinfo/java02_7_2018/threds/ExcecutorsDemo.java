package com.bellinfo.java02_7_2018.threds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable a1=new Myrunnable("java");
		Runnable a2=new Myrunnable("Sql");
		Runnable a3=new Myrunnable("Scala");
		Runnable a4=new Myrunnable("python");
		
		ExecutorService exce=Executors.newFixedThreadPool(2);
		ExecutorService exce1=Executors.newCachedThreadPool();
		exce.execute(a1);
		exce.execute(a2);
		exce.execute(a3);
		exce.execute(a4);
	}

}
class Myrunnable implements Runnable{
	Thread t1=null;
	Myrunnable(String name){
		t1=new Thread(this, name);
		setName();
		start();
		
	}
	private void start() {
		// TODO Auto-generated method stub
		
	}
	private void setName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Thread started------"+t1.getName());
		for(int i=1;i<=5;i++) {
			System.out.println(t1.getName()+i);
		}
		System.out.println(" Thread endeded------"+t1.getName());
	}
}
