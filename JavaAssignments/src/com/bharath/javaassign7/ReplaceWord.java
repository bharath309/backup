package com.bharath.javaassign7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReplaceWord {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		String s="";
		String original="";

		try {
			while((s=br.readLine())!=null) {
				System.out.println(s);
					original=original+s+"\n";
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
		String new1=original.replaceAll("this", "is");
		System.out.println(new1);
	}

}
