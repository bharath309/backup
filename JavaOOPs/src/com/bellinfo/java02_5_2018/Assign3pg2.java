package com.bellinfo.java02_5_2018;

import java.util.Scanner;

public class Assign3pg2 {

	public static void main(String[] args) {


		Scanner in =new Scanner(System.in);
		int[] numberofStudents=new int[2];
		
		String[] studentNumber=new String[2];
		String[] studentName=new String[2];
		double[] studentFee=new double[2];
		char[] studentSection=new char[2];
		char sectionFilter;
		

		for(int i =0;i<numberofStudents.length;i++) {
			System.out.println("enter student ID number");
			studentNumber[i]=in.next();
			System.out.println("enter student Name ");
			studentName[i]=in.next();
			System.out.println("enter student fee ");
			studentFee[i]=in.nextDouble();
			System.out.println("enter student Section ");
			studentSection[i]=in.next().charAt(0);

		}

		for(int i=0;i<studentNumber.length;i++) {
			
			System.out.println(studentNumber[i]+" "+studentName[i]+" "+studentFee[i]+" "+studentSection[i]);
			//studentArray[i]=in.next().charAt(0);
		}
		
		System.out.println("Enter Section number: ");
		sectionFilter=in.next().charAt(0);
		for(int i=0;i<numberofStudents.length;i++) {
			if(sectionFilter==studentSection[i]) {
				System.out.println(studentNumber[i]+" "+studentName[i]+" "+studentFee[i]+" "+studentSection[i]);
			}
		}
		
		
	}

}


