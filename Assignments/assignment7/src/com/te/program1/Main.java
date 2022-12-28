package com.te.program1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	List<Integer>list1=new ArrayList<Integer>();
	System.out.println("enter the list1 values:");
	for (int i = 0; i < 5; i++) {
		list1.add(scanner.nextInt());
	}
	System.out.println("enter the list2 values:");
	List<Integer>list2=new ArrayList<Integer>();
	for (int i = 0; i < 5; i++) {
		list2.add(scanner.nextInt());
	}
	list1.addAll(list2);
	UserMainCode.sortMergedArrayList(list1);
	
	
}
}
