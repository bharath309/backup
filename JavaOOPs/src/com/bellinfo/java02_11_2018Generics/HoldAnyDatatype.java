package com.bellinfo.java02_11_2018Generics;

public class HoldAnyDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrye<String> a1=new Arrye<>(10);
		a1.setArry("bharath");
		a1.setArry("siva");
		a1.setArry("Asish");
		a1.setArry("kamal");
	
	for(int i=0;i<a1.getLength();i++) {
		System.out.println(a1.getArry(i));
	}
	}
}
class Arrye<T>{
	T[] arry;
	static int index=0;
	int length;
	@SuppressWarnings("unchecked")
	Arrye(int size){
		length=size;
		arry=(T[])new Object[size];
		//1.make array generic 2.define size 3.define a mthd to setvalue	
	}
	public void setArry(T value) {
		arry[index]=value;
		index++;
	}
	public T getArry(int x) {
		return arry[x];
	}
	public int getLength() {
		return length;
	}
}

