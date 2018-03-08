package com.bharath.java02_23;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,9,7,3,9,4,7,7,1,10,3,1,1};
		int count =0;
		int a;
		Map<Integer, Integer> map=new TreeMap<>();
		for(int i=0;i<array.length;i++) {
			a=array[i];
			count=0;
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;

				}
				map.put(a, count);
			}
		}	
			
			for(Entry<Integer, Integer> d:map.entrySet()) {
				if(d.getValue()>1) {
					System.out.println(d.getKey()+"*"+d.getValue()+"= "+d.getKey()*d.getValue());
				}
			}
		
	}

}
