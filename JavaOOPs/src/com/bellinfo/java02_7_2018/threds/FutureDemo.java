package com.bellinfo.java02_7_2018.threds;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) {
		System.out.println(" Program Started ");
		ExecutorService exce=Executors.newCachedThreadPool();
		Future<Integer> future= exce.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				System.out.println(" started");
				Random r1=new Random();
				int x=r1.nextInt();
				System.out.println(" ended");
				return x;
			}
			
		});
		exce.shutdown();
		try {
			Integer obj=future.get();
			System.out.println(obj.intValue());
		} catch (InterruptedException | ExecutionException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
