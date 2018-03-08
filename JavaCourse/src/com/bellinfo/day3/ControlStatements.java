package com.bellinfo.day3;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// System.out.println("enter your marks");
		// int marks = input.nextInt();
		//
		System.out.println("enter a max number: ");
		int max = input.nextInt();
		System.out.println("enter multiple of: ");
		int multiple = input.nextInt();
		ctlStmtMethode(max, multiple);
		// controlIfStmt(marks);
		
//		int c =20;
//		while (c<=25) {
//			c++;
//			System.out.println("c value: "+ c);
//			
//		}
//		int d =20;
//		do {
//			d++;
//			System.out.println("d value: "+ d);	
//		}
//		while(d<=25);
	}

	private static void ctlStmtMethode(int max, int multiple) {
		for (int i = 1; i <= max; i++) {
			int x = multiple * i;
			System.out.println(x);
//
		}
	}

	// private static void controlIfStmt(int marks) {
	// if (marks>=90) {
	// System.out.println("Grade A");
	// }
	// else if (marks<90 && marks>40) {
	// System.out.println("Grade B");
	// }
	// else {
	// System.out.println("failed");
	// }
	// }

}
