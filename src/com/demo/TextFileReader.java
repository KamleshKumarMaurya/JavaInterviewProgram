package com.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class TextFileReader {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter file path : ");
		FileReader fin = new FileReader(new Scanner(System.in).nextLine());
		BufferedReader bin = new BufferedReader(fin);
		HashMap<String,Integer> map = new HashMap<>();
		int lineCount=0,wordsCount=0;
		String words[], line;
		while((line=bin.readLine()) != null)
		{
			lineCount++;
			words = line.split("[,. ]+");
			wordsCount += words.length;
			for(String word : words)
			{
				if(map.get(word) != null)
				{
					map.put(word, map.get(word)+1);
				}
				else
					map.put(word, 1);
			}
		}
		System.out.println("Line Count : "+lineCount);
		System.out.println("Word Count : "+wordsCount);
		System.out.println("Word Occurance : "+map);
		System.out.println("Sort on key =================");
		TreeMap<String, Integer> tmap = new TreeMap<>(map);
		System.out.println(tmap);
		TreeSet<Entry<String,Integer>> tset = new TreeSet<>((o1,o2) -> o1.getValue().compareTo(o2.getValue()));
		tset.addAll(map.entrySet());
		System.out.println("Sort on value=================");
		tset.stream().forEach(System.out::println);
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(tset);
		System.out.println("Least element : "+list.get(0));
		System.out.println("Maximum elements : "+list.get(list.size()-1));
	}

}
