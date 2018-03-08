package com.bellinfo.assignment;
import java.util.Scanner;
public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a =input.nextInt();
		int b=1;
		
			for(int i=1; i<=a;i++) {
			b=b*i;
			
			}
			System.out.println(b);
			
		
		}
	}

