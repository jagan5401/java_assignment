package com.te.program2;

import java.util.Scanner;
//sum of power of elements Arrays
public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	int size=scanner.nextInt();
	Integer[] array=new Integer [size];
	System.out.println("Enter the values :");
	for (int i = 0; i < array.length; i++) {
		array[i]=scanner.nextInt();
	}
	System.out.println(UserMainCode.getBigDiff(array));
	
}
}
