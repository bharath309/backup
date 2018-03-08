package com.bharath.javaassign7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("abc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hello this my world");
		bw.newLine();
		char[] ch= {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("lets enjoy here");
		bw.flush();
		bw.close();
		
		
	}
	
		

}
