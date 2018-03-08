package com.bellinfo.java02_7_2018.threds;

public class ThreadDemo {

	public static void main(String[] args) {
		new MyThread("Java");
		new MyThread("SQL");
	
		new MyRunnable("python");
	}
}

class MyRunnable implements Runnable{
	Thread t1=null;
	MyRunnable(String name){
		t1=new Thread(this, name);
		t1.start();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			if(t1.getName().equals("python")) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			System.out.println(t1.getName()+i);
		}
	}
	
}
class MyThread extends Thread{

	int a =0;
	MyThread(String name){
		setName(name);
		start();


	}
	public synchronized void run() {
		for(int i=0;i<=5;i++) {
			if(getName().equals("java")) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println(getName()+i);
		}
	}


}