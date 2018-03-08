package com.bellinfo.java02_17_2018;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {

		String fileName = "ABC.txt";
		String workingDirectory = System.getProperty("user.dir");
		System.out.println(workingDirectory);
		String fullPath = workingDirectory + File.separator + fileName;
		System.out.println(fullPath);
		
		File f1 = new File(fullPath);
		
		String text = "Hey This is my first program on files";
		// -->one way of writing to a file
		try {
			FileOutputStream fos = new FileOutputStream(fullPath);
			byte[] byteArray = text.getBytes();
			fos.write(byteArray);
			fos.flush();
			fos.close();
			
		} catch (IOException e) {
			System.out.println("FileNotFoundException occured");
			e.printStackTrace();
		}
		
		//--> 2nd way of writing to a file
		
		try {
			FileWriter fw = new FileWriter(f1,true);
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write("\n This is another way of writing to a file");
			bf.flush();
			bf.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//	-->	Read the file data
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(f1);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			while(dis.available()!=0) {
				System.out.println(dis.readLine());
			}
		}catch (IOException e) {
			e.printStackTrace();
		}

		
		
		//--> 2nd way of read a file
		System.out.println("Second way of reading a file");
		String text1;
		try {
			BufferedReader br = new BufferedReader(new FileReader(fullPath));
			while((text1=br.readLine())!= null) {
				System.out.println(text1);
			} 
		} 	catch (IOException e) {
				e.printStackTrace();
		}
			
		}
		
	}