package com.bellinfo.java02_5_2018;

import java.util.Scanner;

public class Assign3Pg1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String[] studentName=new String[3];
		String[] studentNumber=new String[3];
		double[] studentFee=new double[3];
		String[] studentSection=new String[3];
		
		
		for(int i =0;i<studentNumber.length;i++) {
			System.out.println("enter student ID numbers");
			studentNumber[i]=in.next();
			System.out.println("enter student Name ");
			studentName[i]=in.next();
			System.out.println("enter student fee ");
			studentFee[i]=in.nextDouble();
			System.out.println("enter student Section ");
			studentSection[i]=in.next();
			
		}
		
		for(int i=0;i<studentNumber.length;i++) {
			
			System.out.println(studentNumber[i]+" "+studentName[i]+" "+studentFee[i]+" "+studentSection[i]);
		}
		
	}

}
