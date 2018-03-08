package com.bharath.javaassign10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonsStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ps=new Person("Max", 18);
		Person ps1=new Person("Peter", 23);
		Person ps2=new Person("Pamela", 23);
		Person ps3=new Person("David", 12);

		
		List<Person> person = Arrays.asList(ps,ps1,ps2,ps3);
		
			System.out.println(person);
		person.stream()
						
						.filter(i->i.getName().startsWith("P") )
						.collect(Collectors.toList())
						.forEach(i->System.out.println(i.getName()));
		
			
		person.stream()
								.filter(i->i.age >1)
								//.sorted((i,j)->Integer.compare(i.age, y))
								
								.collect(Collectors.toList())
								.forEach(i->System.out.print(" "+i.getName()));
		//System.out.println(ls);
	}

}
class Person{
	String name;
	int age;

	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}