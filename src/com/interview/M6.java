package com.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class M6 {
	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter("file1.txt");
			pw.println(123);
			pw.println(444);
			pw.println(222);
			PrintWriter pw2 = new PrintWriter("file2.txt");
			pw2.println("aaa");
			pw2.println("bb");
			pw2.println("ccc");
			pw.close();
			pw2.close();
			PrintWriter pw3 = new PrintWriter("file3.txt");
			BufferedReader bin = new BufferedReader(new FileReader("file1.txt"));
			String line = bin.readLine();
			while(line != null) {
				pw3.println(line);
				line = bin.readLine();
			}
			BufferedReader bin2 = new BufferedReader(new FileReader("file2.txt"));
			String line2 = bin2.readLine();
			while(line2 != null) {
				pw3.println(line2);
				line2 = bin2.readLine();
			}
			pw3.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
