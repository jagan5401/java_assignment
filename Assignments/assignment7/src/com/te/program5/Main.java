package com.te.program5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
	
public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of list1 :");
	int size1=scanner.nextInt();
	
	List<String>list1=new ArrayList<String>();
	System.out.println("enter the list1 values:");
	for (int i = 0; i < size1; i++) {
		list1.add(scanner.next());
	}
	System.out.println("Enter the size of list2 :");
	int size2=scanner.nextInt();
	List<String>list2=new ArrayList<String>();
	System.out.println("enter the list2 values:");
	for (int i = 0; i < size2; i++) {
		list2.add(scanner.next());
	}
	
	List finalresult=UserMainCode.arrayListSubtractor(list1,list2);
	for (Object seat : finalresult) {
		System.out.println(seat);
	}
	
}
}
