package com.bharath.java.functionalInterfaces;


import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

@SuppressWarnings("unused")
public class StreamEx {

	public static void main(String[] args) {

		/*IntStream.range(1, 10);
		
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,10);
	
	list
		.stream()
		.filter(i ->{
			System.out.println("insde the filter"+i);
			return i%2==0;
		}).forEach(i->System.out.println("inside the foreach"+i));
		*/
		
		
		List<String> slist=Arrays.asList("a1","c3","b1","c1","d1","c2");
		slist.stream()
				.filter(i-> i.startsWith("c"))
				.sorted()
				.map(i->i.substring(1))
				.mapToInt(s-> Integer.parseInt(s))
				
				.forEach(i->System.out.println(i));
		
		
		/*StreamEx a=new StreamEx();
	System.out.println(a.isPrime(10));
	}
	public boolean isPrime(int a) {
		int b=0;
		for(int i=2;i<a;i++) {
			if(b==a%i) {
				return false;
			}
		}
		return true;
	}*/
	}	
}
