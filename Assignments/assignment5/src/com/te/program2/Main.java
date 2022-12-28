package com.te.program2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of Array :");
	//Integer size=scanner.nextInt();
	Integer [] array= {10,15,20,25,30,100};
	System.out.println("Enter the Integer array from lower to upper :");
//	for (int i = 0; i < size; i++) {
//		array[i]=scanner.nextInt();
//	}
	
	System.out.println("Enter the number :");
	Integer number1=scanner.nextInt();
	
	
	
	Integer Output=UserMainCode.addAndReverse(array,number1);
	System.out.println(Output);
}
}
