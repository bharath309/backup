package com.bellinfo.assignment;
import java.util.Scanner;
public class findPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int A =input.nextInt();
		
		for(int i=2; i<A; i++) {
			if (A%i==0) {
				System.out.println("This is not prime Number");
				break;
				}
			else {
				System.out.println("this is the prime number");
				break;
			}
		}
		
	}

}
