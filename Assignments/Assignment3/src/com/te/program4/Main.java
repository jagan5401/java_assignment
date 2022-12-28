package com.te.program4;

import java.util.Scanner;
//Largest Element
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
	System.out.println(UserMainCode.averageElements(array));
	
}
}
