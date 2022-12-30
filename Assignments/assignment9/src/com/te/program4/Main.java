package com.te.program4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Size");
	int size = scanner.nextInt();
	Map<String ,Float>map=new HashMap<String, Float>();
	for (int i = 0; i < size; i++) {
		System.out.println("Enter the device and price :");
		map.put(scanner.next(), scanner.nextFloat());	
	}
	System.out.println("Enter the Size of search content");
	int size1 = scanner.nextInt();
	String array[]=new String [size1];
	for (int i = 0; i < array.length; i++) {
		System.out.println("Enter the device  :");
		array[i]=scanner.next();
	}
	Float costEstimator = UserMainCode.costEstimator(array,map);
	
	System.out.println(costEstimator);
	
	
	
}
}
