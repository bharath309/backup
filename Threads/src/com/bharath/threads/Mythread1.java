 package com.bharath.threads;


import java.sql.Timestamp;


public class Mythread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo a= new ThreadDemo();
		
		Timestamp t=new Timestamp(System.currentTimeMillis());
		System.out.println(t);
		a.start();//this method is from Thread which is help to run the class
		//Main thread starts child thread
		System.out.println(t);
		for(int i=0;i<=5;i++) {
			System.out.println("this is main thread");
		}
		System.out.println(t);
	}

}

class ThreadDemo extends Thread{
	public void run() {
		for(int i=0
				;i<=5;i++) {
			System.out.println("this is child thread");
		}
	}
}