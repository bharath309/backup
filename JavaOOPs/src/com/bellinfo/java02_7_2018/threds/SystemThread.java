package com.bellinfo.java02_7_2018.threds;

public class SystemThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Thread is a built in class
		Thread t1=new Thread();
		t1.setName("Java");
		Thread t2=new Thread();
		t2.setName(".net");
		for (int i=0;i<=5;i++) {
			System.out.println(t1.getName()+i+" priority "+t1.getPriority());
			try {
				
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t2.getName()+i+" priority "+t2.getPriority( ));
			
		}
	}

}
