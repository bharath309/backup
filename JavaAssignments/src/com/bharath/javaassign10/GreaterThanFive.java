package com.bharath.javaassign10;

import java.util.Arrays;
import java.util.List;

public class GreaterThanFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numbers = Arrays.asList(1, 5, 7, 3, 8, 10, 48, 67, 2, 23, 56, 11, 4, 100);
		 numbers.stream()
		 				.filter(i->i.intValue()>5)
		 				.sorted()
		 				.forEach(i->System.out.println(i));
	}

}
