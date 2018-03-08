package com.bharath.javaassign10;

import java.util.Arrays;
import java.util.List;

public class CreateListWithFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=Arrays.asList("d2", "a2", "b1", "b3", "c");
		ls.stream()
					.filter(i-> i.startsWith("a"))
					.sorted()
					.map(i->i.toUpperCase())
					.forEach(i->System.out.println(i));
	}

}
