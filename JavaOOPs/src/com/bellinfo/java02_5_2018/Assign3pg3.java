package com.bellinfo.java02_5_2018;

import java.util.Scanner;

public class Assign3pg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("enter number of students");
		int numberofStudents=in.nextInt();
		Student[] student=new Student[numberofStudents];
		
		for(int i =0;i<numberofStudents;i++) {
			student[i]=new Student();
			System.out.println("enter student" +i+" ID number");
			student[i].setStudentNumber(in.nextInt());
			System.out.println("enter student" +i+" Name ");
			student[i].setStudentName(in.next());
			System.out.println("enter student " +i+"fee ");
			student[i].setStudentFee(in.nextDouble());
			System.out.println("enter student" +i+" Section ");
			student[i].setStudentSection(in.next().charAt(0));

		}

		for(int i=0;i<numberofStudents;i++) {
			
			System.out.println(student[i].toString());
			//studentArray[i]=in.next().charAt(0);
		}
		
		
	}

}
class Student{
	
	int studentNumber;
	String studentName;
	double studentFee;
	char studentSection;
	
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}
	public char getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(char studentSection) {
		this.studentSection = studentSection;
	}
	
	@Override
	public String toString() {
		return "studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentFee=" + studentFee
				+ ", studentSection=" + studentSection + " ";
	}
	public Student() {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.studentSection = studentSection;
	}
	
	
	
}