package com.te.program5;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	Integer size=scanner.nextInt();
	Integer[]array=new Integer[size];
	System.out.println("Enter the Integer array :");
	for (int i = 0; i < size; i++) {
		array[i]=scanner.nextInt();
	}
	
	//int[] array= {11,-2,5,1,2,3,4,5,6};
	
	boolean Output=UserMainCode.searchSequence (array);
	System.out.println("searchSequence"+Output);
}
}
