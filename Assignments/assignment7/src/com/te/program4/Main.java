package com.te.program4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
	
public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	int size=scanner.nextInt();
	
	List<String>list1=new ArrayList<String>();
	System.out.println("enter the list1 values:");
	for (int i = 0; i < size; i++) {
		list1.add(scanner.next());
	}
	
	UserMainCode.convertToStringArray(list1);
	
	
}
}
