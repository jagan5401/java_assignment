package com.te.program6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
	
public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of list1 :");
	int size=scanner.nextInt();
	
	List<Integer>list1=new ArrayList<Integer>();
	System.out.println("enter the list1 values:");
	for (int i = 0; i < size; i++) {
		list1.add(scanner.nextInt());
	}
	
	List<Integer>list2=new ArrayList<Integer>();
	System.out.println("enter the list2 values:");
	for (int i = 0; i < size; i++) {
		list2.add(scanner.nextInt());
	}
	
	List finalresult=UserMainCode.generateOddEvenList (list1,list2);
	for (Object seat : finalresult) {
		System.out.println(seat);
	}
	
}
}
