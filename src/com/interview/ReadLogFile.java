package com.interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadLogFile {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		FileReader fin = new FileReader("File.log");
		BufferedReader bin = new BufferedReader(fin);
		String line;
		while((line=bin.readLine()) != null) {
			list.add(line);
		}
		list.stream().forEach(e -> System.out.println(e));
		String search = "16:DEC:2015";
		int count=0;
		for(int i=0; i<list.size(); i++) {
			String s1 = list.get(i);
			if(s1.contains(search)) {
				System.out.println("16:DEC:2015");
				count++;
			}
		}
		System.out.println("total numbers of time : "+count);
	}

}
