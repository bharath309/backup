package com.bharath.threads;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup pg=new ThreadGroup("Parent Group");
		@SuppressWarnings("unused")
		ThreadGroup cg=new ThreadGroup(pg,"Child Group");
	Mythread t1=new Mythread(pg,"child thread");
	Mythread t2=new Mythread(pg,"child thread2");
	t1.start();
	t2.start();
	System.out.println(pg.activeCount());
	System.out.println(pg.activeGroupCount());
	pg.list();
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	pg.list();
	}

}
class Mythread extends Thread{
	Mythread(ThreadGroup g, String name){
		super (g,name);
	}
	public void run() {
		System.out.println("child thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}