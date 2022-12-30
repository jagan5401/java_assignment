package com.te.program2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size :");
//	Integer size= scanner.nextInt();
	Map<String,String>map=new HashMap<String, String>(3);
//	for (int i = 0; i <size; i++) {
//		System.out.println("Enter the State and capital:");
//		map.put(scanner.nextInt(), scanner.next());
//	}
	map.put("punjab", "chandigar");
	map.put("karnataka", "bangalore");
	map.put("kerala", "thiruvananthapuram");
	map.put("punjab", "chandigar");
	map.put("jargand", "ranji");
	map.put("tamilnadu", "chennai");
	System.out.println("Enter the capital to search :");
	String capital= scanner.next();
	
	String output = UserMainCode.getCapital (map,capital);
	System.out.println(output);
	
}
}
