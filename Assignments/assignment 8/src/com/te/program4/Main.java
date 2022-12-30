package com.te.program4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size :");
Integer size= scanner.nextInt();
	TreeMap<String,String>map=new TreeMap<String,String>();
	for (int i = 0; i <size; i++) {
		//System.out.println("Enter the Employee Name and Designation:");
		map.put(scanner.next(), scanner.next());
	}
	System.out.println("Enter the Designation :");
	String job= scanner.next();
	
	
	
	Set<String> output = UserMainCode.obtainDesignation(map,job);
	for (String string : output) {
		System.out.println(string);
	}
	
	
}
}
