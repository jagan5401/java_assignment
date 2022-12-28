package com.te.program1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	//Integer size=scanner.nextInt();
	Integer [] array= {1,10,15,20,10,2};
	System.out.println("Enter the Integer array from lower to upper :");
//	for (int i = 0; i < size; i++) {
//		array[i]=scanner.nextInt();
//	}
	
	
	
	
	
	Integer[] Output=UserMainCode.removeTens(array);
	for (int i = 0; i < Output.length; i++) {
		System.out.println(Output);
	}
}
}
