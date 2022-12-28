package com.te.program5;

import java.util.Scanner;
//Largest Element
public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	int size=scanner.nextInt();
	Integer[] array1=new Integer [size];
	System.out.println("Enter the values :");
	for (int i = 0; i < size; i++) {
		array1[i]=scanner.nextInt();
	}
	Integer[] array2=new Integer [size];
	//System.out.println("Enter the values :");
	for (int i = 0; i < size; i++) {
		array2[i]=scanner.nextInt();
	}
	System.out.println(UserMainCode.sumCommonElements (array1,array2));
	
}
}
