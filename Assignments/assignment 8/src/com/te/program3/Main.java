package com.te.program3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size :");
Integer size= scanner.nextInt();
	Map<Integer,Integer>map=new HashMap<Integer,Integer>(4);
	for (int i = 0; i <size; i++) {
		System.out.println("Enter the year and No f Admission:");
		map.put(scanner.nextInt(), scanner.nextInt());
	}
//	map.put(2011,200000 );
//	map.put(2012,300000 );
//	map.put(2013,45000 );
//	map.put(2014,25000 );
	
	
	
	Integer output = UserMainCode.getYear (map);
	System.out.println(output);
	
}
}
