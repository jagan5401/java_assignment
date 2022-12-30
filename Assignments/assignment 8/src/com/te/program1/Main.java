package com.te.program1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size :");
//	Integer size= scanner.nextInt();
	Map<Integer,String>map=new HashMap<Integer, String>(3);
//	for (int i = 0; i <size; i++) {
//		System.out.println("Enter the number and String:");
//		map.put(scanner.nextInt(), scanner.next());
//	}
	map.put(11, "raja");
	map.put(31, "rani");
	map.put(41, "kamal");
	String maxKeyValue = UserMainCode.getMaxKeyValue (map.toString());
	System.out.println(maxKeyValue);
	
}
}
