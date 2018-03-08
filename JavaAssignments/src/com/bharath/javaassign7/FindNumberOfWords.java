package com.bharath.javaassign7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindNumberOfWords {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String ch="";
		String j="";

		try {
			while((ch=br.readLine())!=null) {
				System.out.println(ch);
				j=j+ch+"\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(j);
		j=j.trim();
		int c=1;
		for(int i=0;i<j.length();i++) {
			if((j.charAt(i)==' ')&&(j.charAt(i+1)!=' ')||(j.charAt(i)=='\n')) {
				c++;
			}
		}
		System.out.println(c);
		System.out.println(j);
	}

}
