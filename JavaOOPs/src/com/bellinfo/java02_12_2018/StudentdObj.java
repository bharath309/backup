package com.bellinfo.java02_12_2018;

import java.util.ArrayList;
import java.util.TreeSet;

public class StudentdObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sd=new Student("bharath", "java", "cbu", "masters");
		ArrayList<Object> al=new ArrayList<>();
		al.add(sd);
		for(Object Student:al) {
			System.out.println(Student.toString());
		}
		TreeSet<Object> ts=new TreeSet<>();
		ts.add(sd);
		for(Object Student:ts) {
			System.out.println(Student.toString());	
		}
	}

}
class Student{
	String name;
	String Course;
	String college;
	String degree;
	public Student(String name, String course, String college, String degree) {
		super();
		this.name = name;
		Course = course;
		this.college = college;
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Course=" + Course + ", college=" + college + ", degree=" + degree + "]";
	}
	
}