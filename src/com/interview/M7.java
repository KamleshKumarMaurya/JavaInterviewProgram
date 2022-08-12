package com.interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//write program to generate new file new.txt in this file write ALl file1 element from file3 elements 
public class M7 {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("new2.txt");
			BufferedReader bin = new BufferedReader(new FileReader("file3.txt"));
			String line1 = bin.readLine();
			while(line1 != null) {
				boolean av = false;
				BufferedReader bin2 = new BufferedReader(new FileReader("file1.txt"));
				String line2 = bin2.readLine();
				while(line2 != null) {
					if(line1.equals(line2)) {
						av = true;
						break;
					}
					line2 = bin2.readLine();
				}
				if(av == false) {
					pw.println(line1);
				}
				line1 = bin.readLine();
			}
			pw.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
