package com.bellinfo.java02_7_2018.threds;

public class Synco {
	public static void main(String args[]) {
		Counter c1= new Counter();
		new Scenario("java",c1);
		new Scenario("SQL",c1);
		new Scenario("Scala",c1);
		new Scenario("angular",c1);
	}

}
class Scenario extends Thread{
	String name;
	Counter count;
	Scenario(String name, Counter count){
		this.name=name;
		this.count=count;
		setName(name);
		start();
	}
	public void run() {
		System.out.println("therad started is***** "+getName());
		count.display(getName());
		count.nonSync(getName());
		System.out.println("therad completed is***** "+getName());
	}
}
class Counter{
	static int a=1;
	public synchronized void display(String name ) {
		for(int i=1;i<=10;i++) {
			System.out.println("thread name: " + name+"counter "+a++);
		}
	}
	public synchronized void nonSync(String name ) {
		for(int i=1;i<=10;i++) {
			System.out.println("nonSync thread name: " + name+"counter "+a++);
		}
	}
	
}