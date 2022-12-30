package com.te.program5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size = scanner.nextInt();
	Map<String ,String>map=new HashMap<String, String>();
	Map<String ,Integer>map1=new HashMap<String, Integer>();
	String id;
	for (int i = 0; i < size; i++) {
		//System.out.println("Enter the id");
		id=scanner.next();
		//System.out.println("Enter the Registration date:");
		map.put(id, scanner.next());	
		//System.out.println("Enter the amount");
		map1.put(id, scanner.nextInt());	
	}
	
	Map<String, Integer> costEstimator = UserMainCode.calculateDiscount (map,map1);
	for ( Entry<String, Integer> entry:costEstimator.entrySet()) {
		String key = entry.getKey();
		int value = entry.getValue();
		System.out.println(key+":"+value);
	}
	
	
	
	
}
}
//A-1010
//20/11/2007
//25000
//B-1011
//04/12/2010
//30000
//C-1012
//11/11/2005
//15000
//D-1013
//02/12/2012
//10000

