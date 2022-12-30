package com.te.program5;

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
String [] state=new String [size];
	for (int i = 0; i < state.length; i++) {
		state[i]=scanner.next();
	}
	
	
	
	Map<String, String> output = UserMainCode.getStateId (state);
	for(Entry<String, String>entry:output.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	
	
}
}
