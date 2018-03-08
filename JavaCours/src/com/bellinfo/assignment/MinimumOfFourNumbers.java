package com.bellinfo.assignment;
import java.util.Scanner;
public class MinimumOfFourNumbers {
	
	public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int a = input.nextInt();
        int b =input.nextInt();
        int c= input.nextInt();
        int d =input.nextInt();
        if (a<b && a<c && a<d){
            System.out.println("Minimum Number is "+ a);
        }
        else if(b<a && b<c && b<d){
            System.out.println("Minimum Number is "+ b);
        }
        else if (c<a && c<b && c<d){
            System.out.println("Minimum Number is "+ c);
        }
        else{
            System.out.println("Minimum Number is "+ d);
        }

    }

}



    

